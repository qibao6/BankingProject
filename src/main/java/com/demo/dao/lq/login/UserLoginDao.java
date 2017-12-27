package com.demo.dao.lq.login;

import java.util.List;

import com.demo.model.Subject;

public interface UserLoginDao {
	/**
	 * 后台用户登陆
	 * @param userName
	 * @return
	 */
	List<Object[]> login(String userName);
	/**
	 * 邀请奖励
	 * @return
	 */
	List<Object[]> inviteRewardsAll(Integer page,Integer size,final String memberName,final String mobilePhone,final String invitationcode,final String invitedcode);
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
	List<Object[]> flist(Subject sub);
	
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
	List<Object[]> fxjAll(Integer subjectId,Integer page,Integer size);
	/**
	 * 付息列表
	 * @param subjectId
	 * @return
	 */
	List<Object[]> fxAll(Integer subjectId,Integer page,Integer size);
	/**
	 * 查询membersId
	 * @param mobilePhone
	 * @return
	 */
	Integer m(String mobilePhone);
	/**
	 * 邀请奖励分页，查询总条数
	 * @return
	 */
	Integer getCount(final String memberName,final String mobilePhone,final String invitationcode,final String invitedcode);
	/**
	 * 体验金付息计划总条数
	 * @return
	 */
	Integer getCount(Integer subjectId);
	/**
	 * 付息计划总条数
	 * @return
	 */
	Integer getCount();
	/**
	 * 修改冻结资金
	 * @param useableBalance
	 * @param memberId
	 */
	void updateJd(Float useableBalance,Integer memberId);
	/**
	 * 打款
	 * @param sum
	 * @param memberId
	 */
	void updatedk(Float sum,Integer memberId);
}
 