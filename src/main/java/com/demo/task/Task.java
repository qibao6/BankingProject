package com.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task {
	//每天12点运行一次 0 0 12 * * ?
	@Scheduled(cron = "0 0/1 15,* * * ?")
	public void task(){
		//去扫描
	}
}
