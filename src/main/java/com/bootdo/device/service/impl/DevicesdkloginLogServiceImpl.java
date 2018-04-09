package com.bootdo.device.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.device.dao.DevicesdkloginLogDao;
import com.bootdo.device.domain.DevicesdkloginLogDO;
import com.bootdo.device.service.DevicesdkloginLogService;



@Service
public class DevicesdkloginLogServiceImpl implements DevicesdkloginLogService {
	@Autowired
	private DevicesdkloginLogDao devicesdkloginLogDao;
	
	@Override
	public DevicesdkloginLogDO get(String id){
		return devicesdkloginLogDao.get(id);
	}
	
	@Override
	public List<DevicesdkloginLogDO> list(Map<String, Object> map){
		return devicesdkloginLogDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return devicesdkloginLogDao.count(map);
	}
	
	@Override
	public int save(DevicesdkloginLogDO devicesdkloginLog){
		return devicesdkloginLogDao.save(devicesdkloginLog);
	}
	
	@Override
	public int update(DevicesdkloginLogDO devicesdkloginLog){
		return devicesdkloginLogDao.update(devicesdkloginLog);
	}
	
	@Override
	public int remove(String id){
		return devicesdkloginLogDao.remove(id);
	}
	
	@Override
	public int batchRemove(String[] ids){
		return devicesdkloginLogDao.batchRemove(ids);
	}
	
}
