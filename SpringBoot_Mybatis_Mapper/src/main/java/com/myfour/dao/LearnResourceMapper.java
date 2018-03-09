package com.myfour.dao;

import java.util.List;

import com.myfour.domain.LearnResource;
import com.myfour.util.MyMapper;

public interface LearnResourceMapper extends MyMapper<LearnResource> {
	List<LearnResource> queryLearnResourceList(LearnResource learnResource);
}