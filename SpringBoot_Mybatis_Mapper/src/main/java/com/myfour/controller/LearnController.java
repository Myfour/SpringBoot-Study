package com.myfour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.myfour.domain.LearnResource;
import com.myfour.service.LearnService;

@RestController
@RequestMapping("/learn")
public class LearnController {
	@Autowired
	private LearnService learnService;

	@RequestMapping("/query")
	public PageInfo<LearnResource> query(@RequestParam(required=false) Integer PageNum) {
		LearnResource learnResource = new LearnResource();

		PageHelper.startPage(PageNum, 3);
		List<LearnResource> list = learnService.queryLearnResourceList(learnResource);
		PageInfo<LearnResource> pageInfo = new PageInfo<>(list);
		System.out.println(pageInfo);
		return pageInfo;

	}

	@RequestMapping("/query1")
	public List<LearnResource> query1() {
		PageHelper.startPage(2, 3);
		List<LearnResource> list = learnService.query();
		System.out.println(list);
		return list;
	}

	@RequestMapping("/add")
	public int add() {
		LearnResource learnResource = new LearnResource();
		learnResource.setAuthor("附件老贼");
		learnResource.setTitle("Hunter");
		return learnService.add(learnResource);
	}

	@RequestMapping("/update")
	public int update() {
		LearnResource learnResource = new LearnResource();
		learnResource.setAuthor("附件老贼");
		learnResource.setTitle("HunterXHunter");
		learnResource.setId((long) 1029);
		return learnService.update(learnResource);
	}

	@RequestMapping("/delete")
	public int delete() {
		Long key = new Long(1029);

		return learnService.delete(key);
	}
}
