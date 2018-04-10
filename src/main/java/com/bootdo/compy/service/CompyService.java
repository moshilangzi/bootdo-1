package com.bootdo.compy.service;

import com.bootdo.compy.domain.CompyDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author 沈文军
 * @email 1992lcg@163.com
 * @date 2018-04-10 10:10:52
 */
public interface CompyService {
	
	CompyDO get(String id);
	
	List<CompyDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CompyDO compy);
	
	int update(CompyDO compy);
	
	int remove(String id);
	
	int batchRemove(String[] ids);
}
