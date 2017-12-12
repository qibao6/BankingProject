package com.demo.dao.yxj;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SubjectRepositoryTest {
	SubjectRepository subjectRepository ;
	@Before
	public void tearDown() throws Exception {
		ApplicationContext app = new ClassPathXmlApplicationContext("spring-config.xml");
		 subjectRepository = (SubjectRepository) app.getBean("subjectRepository");
	}

	@Test
	public void test() {
		List<Object[]> list = subjectRepository.subjectindex();
		System.out.println(list);
	}
}
