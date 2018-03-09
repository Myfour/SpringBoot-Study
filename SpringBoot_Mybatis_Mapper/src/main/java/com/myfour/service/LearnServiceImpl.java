package com.myfour.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myfour.dao.LearnMapper;
import com.myfour.entity.LearnResource;
@Service
public class LearnServiceImpl implements LearnService{
	@Autowired
	LearnMapper learnMapper;
	@Override
	public List<LearnResource> queryLearnResourceList(LearnResource learnResource) {
		return learnMapper.queryLearnResourceList(learnResource);
	}
	@Override
	public int add(LearnResource learnResource) {
		
		return learnMapper.add(learnResource);
	}
	@Override
	public int deleteByIds(String[] ids) {
		
		return learnMapper.deleteByIds(ids);
	}
	@Override
	public LearnResource queryLearnResourceById(Long id) {
		
		return learnMapper.queryLearnResourceById(id);
	}
	@Override
	public int update(LearnResource learnResource) {
		
		return learnMapper.update(learnResource);
	}

}
