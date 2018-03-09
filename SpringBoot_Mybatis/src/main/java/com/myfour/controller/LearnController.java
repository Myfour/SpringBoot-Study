package com.myfour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.myfour.entity.LearnResource;
import com.myfour.service.LearnService;

@RestController
@RequestMapping("/learn")
public class LearnController {
	@Autowired
	private LearnService learnService;
	@RequestMapping("/query")
	public List<LearnResource> query() {
		LearnResource learnResource=new LearnResource();
		
		PageHelper.startPage(1,2);
		List<LearnResource> list=learnService.queryLearnResourceList(learnResource);
		System.out.println(list);
		return list;
	}
	@RequestMapping("/add")
	public int add() {
		LearnResource learnResource=new LearnResource();
		learnResource.setAuthor("P$y.p");
		learnResource.setTitle("CDC");
		learnResource.setUrl("www.Higher.org");
		return learnService.add(learnResource);
		
	}
	@RequestMapping("/update")
	public int update() {
		LearnResource learnResource=new LearnResource();
		learnResource.setAuthor("KingKong");
		learnResource.setTitle("HongKong");
		learnResource.setUrl("www.Hk.org");
		learnResource.setId((long)1029);
		return learnService.update(learnResource);
		
	}
	@RequestMapping("/delete")
	public int delete() {
		String[] ids=new String[] {"1032","1033	"};
		return learnService.deleteByIds(ids);
	}
	
	@RequestMapping("/queryById")
	public LearnResource queryOne() {
		return learnService.queryLearnResourceById((long)999);
	}
}
