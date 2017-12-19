package com.demo.service.lq;

import java.util.List;

public interface LoginService {
	List<Object[]> inviteRewardsAll();
	Object[]  obj(Integer awardRecordsId);
	List<Object[]> olist(Integer awardRecordsId);
	List<Object[]> flist();
	Object[] sub(Integer subjectId);
	List<Object[]> fxjAll(Integer subjectId);
	List<Object[]> fxAll(Integer subjectId);
	List<Object[]> txAll();
	Integer m(String mobilePhone);
}
