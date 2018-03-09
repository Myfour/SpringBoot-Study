package com.myfour.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myfour.dao.LearnResourceMapper;
import com.myfour.domain.LearnResource;

@Service
public class LearnService {
	@Autowired
	private LearnResourceMapper learnResourceMapper;
	public List<LearnResource> queryLearnResourceList(LearnResource learnResource){
		return learnResourceMapper.queryLearnResourceList(learnResource);
	}
	
	public List<LearnResource> query(){
		return learnResourceMapper.selectAll();
	}
	public int add(LearnResource record) {
		return learnResourceMapper.insert(record);
	}
	
	public int update(LearnResource record) {
		return learnResourceMapper.updateByPrimaryKey(record);
	}
	public int delete(Object key) {
		return learnResourceMapper.deleteByPrimaryKey(key);
	}
}
