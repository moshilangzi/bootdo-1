package com.bootdo.device.service;

import com.bootdo.device.domain.DevicesdkloginLogDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-04-08 11:28:15
 */
public interface DevicesdkloginLogService {
	
	DevicesdkloginLogDO get(String id);
	
	List<DevicesdkloginLogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DevicesdkloginLogDO devicesdkloginLog);
	
	int update(DevicesdkloginLogDO devicesdkloginLog);
	
	int remove(String id);
	
	int batchRemove(String[] ids);
}
