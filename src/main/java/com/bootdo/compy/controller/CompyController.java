package com.bootdo.compy.controller;

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

import com.bootdo.compy.domain.CompyDO;
import com.bootdo.compy.service.CompyService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author 沈文军
 * @email 1992lcg@163.com
 * @date 2018-04-10 10:10:52
 */
 
@Controller
@RequestMapping("/compy/compy")
public class CompyController {
	@Autowired
	private CompyService compyService;
	
	@GetMapping()
	@RequiresPermissions("compy:compy:compy")
	String Compy(){
	    return "compy/compy/compy";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("compy:compy:compy")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CompyDO> compyList = compyService.list(query);
		int total = compyService.count(query);
		PageUtils pageUtils = new PageUtils(compyList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("compy:compy:add")
	String add(){
	    return "compy/compy/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("compy:compy:edit")
	String edit(@PathVariable("id") String id,Model model){
		CompyDO compy = compyService.get(id);
		model.addAttribute("compy", compy);
	    return "compy/compy/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("compy:compy:add")
	public R save( CompyDO compy){
		if(compyService.save(compy)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("compy:compy:edit")
	public R update( CompyDO compy){
		compyService.update(compy);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("compy:compy:remove")
	public R remove( String id){
		if(compyService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("compy:compy:batchRemove")
	public R remove(@RequestParam("ids[]") String[] ids){
		compyService.batchRemove(ids);
		return R.ok();
	}
	
}
