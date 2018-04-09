package com.bootdo.device.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-04-08 11:28:15
 */
public class DevicesdkloginLogDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private String id;
	//
	private Date operTime;
	//0001 初次登录(注册)  0002 重复登录(注册)
	private String operType;
	//与RspCode定义一致 0 登录成功
	private Integer resultCode;
	//
	private Date clientTime;
	//
	private String licenseKey;
	//
	private String softId;
	//
	private Integer softPrivateid;
	//
	private String macAddr;
	//
	private String client;
	//
	private String manufacturer;
	//
	private String productmodel;
	//
	private String deviceid;
	//
	private String city;
	//
	private String ip;
	//0 作废(禁用)(模组被新的license注册 原先的注册记录就被禁用）  1 可用  
	private String enable;
	//注册记录被作废(禁用)的时间
	private Date disableTime;

	/**
	 * 设置：
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setOperTime(Date operTime) {
		this.operTime = operTime;
	}
	/**
	 * 获取：
	 */
	public Date getOperTime() {
		return operTime;
	}
	/**
	 * 设置：0001 初次登录(注册)  0002 重复登录(注册)
	 */
	public void setOperType(String operType) {
		this.operType = operType;
	}
	/**
	 * 获取：0001 初次登录(注册)  0002 重复登录(注册)
	 */
	public String getOperType() {
		return operType;
	}
	/**
	 * 设置：与RspCode定义一致 0 登录成功
	 */
	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}
	/**
	 * 获取：与RspCode定义一致 0 登录成功
	 */
	public Integer getResultCode() {
		return resultCode;
	}
	/**
	 * 设置：
	 */
	public void setClientTime(Date clientTime) {
		this.clientTime = clientTime;
	}
	/**
	 * 获取：
	 */
	public Date getClientTime() {
		return clientTime;
	}
	/**
	 * 设置：
	 */
	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}
	/**
	 * 获取：
	 */
	public String getLicenseKey() {
		return licenseKey;
	}
	/**
	 * 设置：
	 */
	public void setSoftId(String softId) {
		this.softId = softId;
	}
	/**
	 * 获取：
	 */
	public String getSoftId() {
		return softId;
	}
	/**
	 * 设置：
	 */
	public void setSoftPrivateid(Integer softPrivateid) {
		this.softPrivateid = softPrivateid;
	}
	/**
	 * 获取：
	 */
	public Integer getSoftPrivateid() {
		return softPrivateid;
	}
	/**
	 * 设置：
	 */
	public void setMacAddr(String macAddr) {
		this.macAddr = macAddr;
	}
	/**
	 * 获取：
	 */
	public String getMacAddr() {
		return macAddr;
	}
	/**
	 * 设置：
	 */
	public void setClient(String client) {
		this.client = client;
	}
	/**
	 * 获取：
	 */
	public String getClient() {
		return client;
	}
	/**
	 * 设置：
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * 获取：
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	/**
	 * 设置：
	 */
	public void setProductmodel(String productmodel) {
		this.productmodel = productmodel;
	}
	/**
	 * 获取：
	 */
	public String getProductmodel() {
		return productmodel;
	}
	/**
	 * 设置：
	 */
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	/**
	 * 获取：
	 */
	public String getDeviceid() {
		return deviceid;
	}
	/**
	 * 设置：
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取：
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 设置：
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * 获取：
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * 设置：0 作废(禁用)(模组被新的license注册 原先的注册记录就被禁用）  1 可用  
	 */
	public void setEnable(String enable) {
		this.enable = enable;
	}
	/**
	 * 获取：0 作废(禁用)(模组被新的license注册 原先的注册记录就被禁用）  1 可用  
	 */
	public String getEnable() {
		return enable;
	}
	/**
	 * 设置：注册记录被作废(禁用)的时间
	 */
	public void setDisableTime(Date disableTime) {
		this.disableTime = disableTime;
	}
	/**
	 * 获取：注册记录被作废(禁用)的时间
	 */
	public Date getDisableTime() {
		return disableTime;
	}
}
