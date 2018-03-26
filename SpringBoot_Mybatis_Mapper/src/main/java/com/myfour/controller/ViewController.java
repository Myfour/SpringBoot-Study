package com.myfour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.myfour.domain.LearnResource;
import com.myfour.service.LearnService;


@Controller
public class ViewController {
	@Autowired
	LearnService learnservice;
	@RequestMapping("/index")
	public String index(Model model,@RequestParam(required=false)Integer pageNum) {
//		PageHelper.startPage(2,2);
//		List<LearnResource> listlearn=learnservice.query();
//		PageInfo<LearnResource> pageInfo=new PageInfo<>(listlearn);
//		model.addAttribute("pageinfo",pageInfo);
//		System.out.println(model);
		return "index";
	}
}
