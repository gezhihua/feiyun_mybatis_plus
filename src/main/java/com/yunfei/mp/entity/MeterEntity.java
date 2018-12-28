package com.yunfei.mp.entity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:52
 */
@TableName("meter")
public class MeterEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String objectId;
	/**
	 * 管理单元ID
	 */
	private String buildingGroupId;
	/**
	 * 楼宇ID
	 */
	private String buildingId;
	/**
	 * 区域ID
	 */
	private String buildingAreaId;
	/**
	 * 
	 */
	private String floor;
	/**
	 * 
	 */
	private String areaName;
	/**
	 * 表计名称
	 */
	private String name;
	/**
	 * 编号
	 */
	private String number;
	/**
	 * 表计类型
	 */
	private String type;
	/**
	 * 表计用途
	 */
	private String purpose;
	/**
	 * 电源号
	 */
	private String powerNum;
	/**
	 * 单位
	 */
	private String unit;
	/**
	 * 运行状态： -1：未运行  1 ：运行中 0：故障
	 */
	private Integer status;
	/**
	 * 
	 */
	private String createUser;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private String modifyUser;
	/**
	 * 
	 */
	private Date modifyTime;
	/**
	 * 有效值
	 */
	private Integer active;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 企业id
	 */
	private String enpId;

	/**
	 * 设置：
	 */
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	/**
	 * 获取：
	 */
	public String getObjectId() {
		return objectId;
	}
	/**
	 * 设置：管理单元ID
	 */
	public void setBuildingGroupId(String buildingGroupId) {
		this.buildingGroupId = buildingGroupId;
	}
	/**
	 * 获取：管理单元ID
	 */
	public String getBuildingGroupId() {
		return buildingGroupId;
	}
	/**
	 * 设置：楼宇ID
	 */
	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}
	/**
	 * 获取：楼宇ID
	 */
	public String getBuildingId() {
		return buildingId;
	}
	/**
	 * 设置：区域ID
	 */
	public void setBuildingAreaId(String buildingAreaId) {
		this.buildingAreaId = buildingAreaId;
	}
	/**
	 * 获取：区域ID
	 */
	public String getBuildingAreaId() {
		return buildingAreaId;
	}
	/**
	 * 设置：
	 */
	public void setFloor(String floor) {
		this.floor = floor;
	}
	/**
	 * 获取：
	 */
	public String getFloor() {
		return floor;
	}
	/**
	 * 设置：
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	/**
	 * 获取：
	 */
	public String getAreaName() {
		return areaName;
	}
	/**
	 * 设置：表计名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：表计名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：编号
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * 获取：编号
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * 设置：表计类型
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：表计类型
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：表计用途
	 */
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	/**
	 * 获取：表计用途
	 */
	public String getPurpose() {
		return purpose;
	}
	/**
	 * 设置：电源号
	 */
	public void setPowerNum(String powerNum) {
		this.powerNum = powerNum;
	}
	/**
	 * 获取：电源号
	 */
	public String getPowerNum() {
		return powerNum;
	}
	/**
	 * 设置：单位
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * 获取：单位
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * 设置：运行状态： -1：未运行  1 ：运行中 0：故障
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：运行状态： -1：未运行  1 ：运行中 0：故障
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	/**
	 * 获取：
	 */
	public String getCreateUser() {
		return createUser;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}
	/**
	 * 获取：
	 */
	public String getModifyUser() {
		return modifyUser;
	}
	/**
	 * 设置：
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	/**
	 * 获取：
	 */
	public Date getModifyTime() {
		return modifyTime;
	}
	/**
	 * 设置：有效值
	 */
	public void setActive(Integer active) {
		this.active = active;
	}
	/**
	 * 获取：有效值
	 */
	public Integer getActive() {
		return active;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置：企业id
	 */
	public void setEnpId(String enpId) {
		this.enpId = enpId;
	}
	/**
	 * 获取：企业id
	 */
	public String getEnpId() {
		return enpId;
	}
}
