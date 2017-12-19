package com.demo.dao.lq.login;

import java.util.List;

import com.demo.model.Members;

public interface UserLoginDao {
	
	/**
	 * 后台用户登陆
	 * @param userName
	 * @return
	 */
	Object[] login(String userName);
	
	/**
	 * 邀请奖励
	 * @return
	 */
	List<Object[]> inviteRewardsAll();
	/**
	 * 奖励记录(邀请手机号，邀请码)
	 * @return
	 */
	Object[] obj(Integer awardRecordsId);
	/**
	 * 奖励记录(列表循环)
	 * @param awardRecordsId
	 * @return
	 */
	List<Object[]> olist(Integer awardRecordsId);
	/**
	 * 付息计划
	 * @return
	 */
	List<Object[]> flist();
	
	/**
	 * 体验金付息计划（标的名称，标的期限，年化收益）
	 * @param subjectId
	 * @return
	 */
	Object[] sub(Integer subjectId);
	/**
	 * 体验金付息计划
	 * @param subjectId
	 * @return
	 */
	List<Object[]> fxjAll(Integer subjectId);
	/**
	 * 付息列表
	 * @param subjectId
	 * @return
	 */
	List<Object[]> fxAll(Integer subjectId);
	/**
	 * 提现列表
	 * @return
	 */
	List<Object[]> txAll();
	/**
	 * 查询membersId
	 * @param mobilePhone
	 * @return
	 */
	Integer m(String mobilePhone);
}
 