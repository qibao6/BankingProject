package com.demo.controller.yxj;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Subject;
import com.demo.service.yxj.SubjectService;

@Controller
@RequestMapping("subject")
public class SubjectHandler {

	@Autowired
	SubjectService subjectService;

	//固收类理财
	@RequestMapping("subindex")
	public String findsublist(Map<String,Object> map){
		System.out.println("==============================");
				List<Object[]> sublist=subjectService.findsubindex();
				map.put("sublist", sublist);
				
				
		return "front/subjectlist";
	}

	
	@RequestMapping("likeshow")
	public String likeshow(Map<String,Object> map,Subject subject,Integer  page){
		System.out.println("今年我不要再喜欢裴尚轩");
		if (page==null) {
			page=1;
		}
		Integer size=3;
		
		Page page1 =subjectService.findpageall(size, page,subject);
//		System.out.println("当前页"+page1.getNumber());
//		System.out.println("总页数"+page1.getTotalPages());
//		System.out.println("结果集"+page1.getContent());
		map.put("page1", page1);
		//List<Object[]> sublist=subjectService.findsubindex();
		//map.put("sublist", sublist);
		return "front/subjectlist";
	}

	//海外配置
	@RequestMapping("oversea")
	public String showoversea(){

		return "front/oversea";
	}

	//股权基金
	@RequestMapping("finance")
	public String showfinance(){

		return "front/finance";
	}

	//固收类理财购买
	@RequestMapping("purchase/{subjectId}")
	public String purchase(Map<String,Object> map,@PathVariable Integer subjectId){
		System.out.println("再见面时，谈笑风生不动情");
		Subject subject=subjectService.getByid(subjectId);
		map.put("subject",subject);
//		List<Object[]> sublist=subjectService.findsubindex();
//		map.put("sublist", sublist);
		return "front/subjectcontent";
	}
	
	//分页模糊查询
		@RequestMapping("findpageall")
		public String findpageall(){
			
			return "front/subjectlist";
		}

}
