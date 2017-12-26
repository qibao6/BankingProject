package com.demo.controller.xx;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskDemo {
	//cron=fixedDelay = 5000
	@Scheduled(cron="0 0/1 15,* * * ?")
	public void doSomething() { 
	    System.out.println("定时任务");
	}
}
