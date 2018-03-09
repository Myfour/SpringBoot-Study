package com.myfour.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.myfour.entity.LearnResource;
//不加@Mapper的话 Service中没法自动装配这个Bean，也就是没法使用
@Mapper
public interface LearnMapper {
	List<LearnResource> queryLearnResourceList(LearnResource learnResource);
	int add(LearnResource learnResource);
	int update(LearnResource learnResource);
	int deleteByIds(String[] ids);
	LearnResource queryLearnResourceById(Long id);
}
