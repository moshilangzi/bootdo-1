package com.bootdo.device.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.device.domain.DevicesdkloginLogDO;
import com.bootdo.device.service.DevicesdkloginLogService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-04-08 11:28:15
 */
 
@Controller
@RequestMapping("/device/devicesdkloginLog")
public class DevicesdkloginLogController {
	@Autowired
	private DevicesdkloginLogService devicesdkloginLogService;
	
	@GetMapping()
	@RequiresPermissions("device:devicesdkloginLog:devicesdkloginLog")
	String DevicesdkloginLog(){
	    return "device/devicesdkloginLog/devicesdkloginLog";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("device:devicesdkloginLog:devicesdkloginLog")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<DevicesdkloginLogDO> devicesdkloginLogList = devicesdkloginLogService.list(query);
		int total = devicesdkloginLogService.count(query);
		PageUtils pageUtils = new PageUtils(devicesdkloginLogList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("device:devicesdkloginLog:add")
	String add(){
	    return "device/devicesdkloginLog/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("device:devicesdkloginLog:edit")
	String edit(@PathVariable("id") String id,Model model){
		DevicesdkloginLogDO devicesdkloginLog = devicesdkloginLogService.get(id);
		model.addAttribute("devicesdkloginLog", devicesdkloginLog);
	    return "device/devicesdkloginLog/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("device:devicesdkloginLog:add")
	public R save( DevicesdkloginLogDO devicesdkloginLog){
		if(devicesdkloginLogService.save(devicesdkloginLog)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("device:devicesdkloginLog:edit")
	public R update( DevicesdkloginLogDO devicesdkloginLog){
		devicesdkloginLogService.update(devicesdkloginLog);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("device:devicesdkloginLog:remove")
	public R remove( String id){
		if(devicesdkloginLogService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("device:devicesdkloginLog:batchRemove")
	public R remove(@RequestParam("ids[]") String[] ids){
		devicesdkloginLogService.batchRemove(ids);
		return R.ok();
	}
	
}
