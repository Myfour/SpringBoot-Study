package com.myfour.service;

import java.util.List;

import com.myfour.entity.LearnResource;

public interface LearnService {
	int add(LearnResource learnResource);
	int update(LearnResource learnResource);
	int deleteByIds(String[] ids);
	LearnResource queryLearnResourceById(Long id);
	List<LearnResource> queryLearnResourceList(LearnResource learnResource);
}
