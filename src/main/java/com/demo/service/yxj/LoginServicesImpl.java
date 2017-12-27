package com.demo.service.yxj;

import java.util.List;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.yxj.LogingRepository;
import com.demo.model.Members;

@Service
public class LoginServicesImpl implements LoginServices{
	
	@Autowired
	LogingRepository loginRepository;

	@Override
	public Members llist(String mobilePhone, String passwords) {
		
		return loginRepository.Loginfront(mobilePhone, passwords);
	}

	@Override
	//短信验证
		public  Integer  message(String phone) throws Exception{
		Integer random=(int)(Math.random()*(9999-1000+1))+1000;
		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod("http://gbk.api.smschinese.cn"); 
		post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=gbk");//在头文件中设置转码
		NameValuePair[] data ={ new NameValuePair("Uid", "jiubiechongfeng"),new NameValuePair("Key", "e5ccf26499d3d4bf6f5f"),new NameValuePair("smsMob",phone),new NameValuePair("smsText","验证码"+random)};
		post.setRequestBody(data);

		client.executeMethod(post);
		Header[] headers = post.getResponseHeaders();
		int statusCode = post.getStatusCode();
		System.out.println("statusCode:"+statusCode);
		for(Header h : headers)
		{
		System.out.println(h.toString());
		}
		String result = new String(post.getResponseBodyAsString().getBytes("gbk")); 
		System.out.println(result); //打印返回消息状态


		post.releaseConnection();
	    return random;
		}

	//注册添加用户到members表
	@Override
	@Transactional
	public void addmember(Members members) {
		loginRepository.save(members);
		
	}

}
