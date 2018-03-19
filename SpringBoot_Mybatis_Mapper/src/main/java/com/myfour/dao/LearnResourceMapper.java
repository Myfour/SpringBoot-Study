package com.myfour.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.myfour.domain.LearnResource;
import com.myfour.util.MyMapper;
//@Mapper
public interface LearnResourceMapper extends MyMapper<LearnResource> {
	List<LearnResource> queryLearnResourceList(LearnResource learnResource);
}