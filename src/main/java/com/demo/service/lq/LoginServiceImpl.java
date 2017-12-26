package com.demo.service.lq;

import java.util.List;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.lq.login.LoginRepository;
import com.demo.model.Subject;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginRepository loginRepository;
	
	
	//短信接口
		public Integer dxjk(String phone) throws Exception {
			Integer a=(int)(Math.random()*(9999-1000+1))+1000;//4位随机数
			HttpClient client = new HttpClient();
			PostMethod post = new PostMethod("http://gbk.api.smschinese.cn");
			post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=gbk");//在头文件中设置转码
			NameValuePair[] data ={ new NameValuePair("Uid", "qibao6"),new NameValuePair("Key", "5e5017202e586ff9a360"),new NameValuePair("smsMob",phone),new NameValuePair("smsText","验证码："+a)};
			post.setRequestBody(data);

			client.executeMethod(post);
			Header[] headers = post.getResponseHeaders();
			int statusCode = post.getStatusCode();
			System.out.println("statusCode:"+statusCode);
			for(Header h : headers)
			{
				System.out.println(h.toString());
			}
			String result = new String(post.getResponseBodyAsString().getBytes("gbk"));//返回消息状态
			System.out.println(result); //打印返回消息状态
			post.releaseConnection();
			return a;
		}

	@Override
	public List<Object[]> inviteRewardsAll(Integer page,Integer size,String memberName, String mobilePhone, String invitationcode, String invitedcode) {
		return loginRepository.inviteRewardsAll(page, size, memberName, mobilePhone, invitationcode, invitedcode);
	}

	@Override
	public Object[]  obj(Integer awardRecordsId) {
		return loginRepository.obj(awardRecordsId);
	}

	@Override
	public List<Object[]> olist(Integer awardRecordsId) {
		return loginRepository.olist(awardRecordsId);
	}

	@Override
	public List<Object[]> flist(Subject sub) {
		return loginRepository.flist(sub);
	}

	@Override
	public Object[] sub(Integer subjectId) {
		return loginRepository.sub(subjectId);
	}

	@Override
	public List<Object[]> fxjAll(Integer subjectId,Integer page,Integer size) {
		return loginRepository.fxjAll(subjectId, page, size);
	}

	@Override
	public List<Object[]> fxAll(Integer subjectId,Integer page,Integer size) {
		return loginRepository.fxAll(subjectId,page,size);
	}

	@Override
	public List<Object[]> txAll(String memberName,String mobilePhone,String bankCard,Integer status,Integer page,Integer size) {
		return loginRepository.txAll(memberName, mobilePhone, bankCard, status, page, size);
	}

	@Override
	public Integer m(String mobilePhone) {
		return loginRepository.m(mobilePhone);
	}

	@Override
	public Integer getCount( String memberName, String mobilePhone, String invitationcode, String invitedcode) {
		return loginRepository.getCount(memberName, mobilePhone, invitationcode, invitedcode);
	}

	@Override
	public Integer getCount(Integer subjectId) {
		return loginRepository.getCount(subjectId);
	}

	@Override
	public Integer getCount() {
		return loginRepository.getCount();
	}

	@Override
	public Integer getCounts(String memberName,String mobilePhone,String bankCard,Integer status) {
		return loginRepository.getCounts(memberName, mobilePhone, bankCard, status);
	}
}
