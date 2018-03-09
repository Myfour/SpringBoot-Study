package com.myfour;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.myfour.interceptor.MyInterceptor;
@Configuration
public class MywebmvcConfiguration extends WebMvcConfigurerAdapter{
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		/**
	     * 配置静态访问资源
	     * @param registry
	     */
		registry.addResourceHandler("/innerstatic/**").addResourceLocations("classpath:/my/");
		/*addResourceHandler是暴露给用户的用来访问静态资源的路径、addResourceLocation是实际的路径*/
		registry.addResourceHandler("/outterstatic/**").addResourceLocations("file:/home/myfour/图片/");/*能通过外部文件夹的对应资源名来访问*/
		super.addResourceHandlers(registry);
		
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		/**
		 * 配置直接跳转到视图的controller
		 * @author myfour
		 */
		//不必再为了单纯的一个跳转页面还在Controller里写一个方法来实现跳转
		registry.addViewController("/toLogin").setViewName("login");
		super.addViewControllers(registry);
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		/**
		 * 添加拦截器
		 * @author myfour
		 * addPathPatterns("/**")对所有请求都拦截，但是排除了/toLogin和/login请求的拦截。
		 */
//		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/toLogin","/login");
		super.addInterceptors(registry);
	}
}
