package com.demo.service.lq;

import java.util.List;

import com.demo.model.Subject;

public interface LoginService {
	List<Object[]> inviteRewardsAll(Integer page, Integer size, String memberName, String mobilePhone,String invitationcode, String invitedcode);
	Object[]  obj(Integer awardRecordsId);
	List<Object[]> olist(Integer awardRecordsId);
	List<Object[]> flist(Subject sub);
	Object[] sub(Integer subjectId);
	List<Object[]> fxjAll(Integer subjectId,Integer page,Integer size);
	List<Object[]> fxAll(Integer subjectId,Integer page,Integer size);
	List<Object[]> txAll(String memberName,String mobilePhone,String bankCard,Integer status,Integer page,Integer size);
	Integer m(String mobilePhone);
	Integer getCount( String memberName,String mobilePhone,String invitationcode, String invitedcode);
	Integer getCount(Integer subjectId);
	Integer getCount();
	Integer getCounts(String memberName,String mobilePhone,String bankCard,Integer status);
	Integer dxjk(String phone) throws Exception;
}
