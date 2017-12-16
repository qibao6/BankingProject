package com.demo.service.lq;

import java.util.List;

public interface LoginService {
	List<Object[]> inviteRewardsAll();
	Object[]  obj(Integer awardRecordsId);
	List<Object[]> olist(Integer awardRecordsId);
	List<Object[]> flist();
	Object[] sub(Integer subjectId);
}
