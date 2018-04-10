package com.bootdo.compy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.compy.dao.CompyDao;
import com.bootdo.compy.domain.CompyDO;
import com.bootdo.compy.service.CompyService;



@Service
public class CompyServiceImpl implements CompyService {
	@Autowired
	private CompyDao compyDao;
	
	@Override
	public CompyDO get(String id){
		return compyDao.get(id);
	}
	
	@Override
	public List<CompyDO> list(Map<String, Object> map){
		return compyDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return compyDao.count(map);
	}
	
	@Override
	public int save(CompyDO compy){
		return compyDao.save(compy);
	}
	
	@Override
	public int update(CompyDO compy){
		return compyDao.update(compy);
	}
	
	@Override
	public int remove(String id){
		return compyDao.remove(id);
	}
	
	@Override
	public int batchRemove(String[] ids){
		return compyDao.batchRemove(ids);
	}
	
}
