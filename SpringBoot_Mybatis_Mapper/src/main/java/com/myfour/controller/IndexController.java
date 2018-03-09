package com.myfour.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myfour.entity.User;
import com.myfour.entity.Website;

@Controller
public class IndexController {
	@RequestMapping("/index")
	public String index(Model model) {
		List<Website> myList=new ArrayList<>();
		myList.add(new Website("马云","阿里巴巴","https://www.1688.com/"));
		myList.add(new Website("马华腾","腾讯","http://www.qq.com/"));
		myList.add(new Website("蓝洞","PUBG","http://pubg.qq.com"));
		model.addAttribute("mylist",myList);
		return "index";
	}
	@RequestMapping("/login")
	@ResponseBody
	public Map<String, Object> login(User user,HttpServletRequest request) {
		String username=user.getUsername();
		String password=user.getPassword();
		
		System.out.println("表单输入的用户："+username+","+password);
		Map<String, Object> map=new HashMap<>();
		if (username!=null&&username!="") {
			request.getSession().setAttribute("user", user);
			map.put("result", "1");	
		}else {
			map.put("result", "2");
		}
			
		return map;
	}
}
