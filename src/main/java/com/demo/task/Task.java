package com.demo.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.demo.service.lq.MembersService;

@Component
public class Task {
	@Autowired
	MembersService membersService;
	//每天12点运行一次 0 0 12 * * ?     
	//5秒执行一次 0/5 * *  * * ?
	@Scheduled(cron="0 0 0/1 * * ?")
	public void task(){
		//去扫描到期时间的购买记录的数据
		membersService.updatesubject_purchase_record();
		System.out.println("111111111111111111");
	}
}
