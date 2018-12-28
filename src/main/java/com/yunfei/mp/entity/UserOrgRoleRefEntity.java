package com.yunfei.mp.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户组织架构角色关联表 
 * 
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:51
 */
@TableName("user_org_role_ref")
public class UserOrgRoleRefEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private String objectId;
	/**
	 * 用户编号
	 */
	private String userId;
	/**
	 * 组织架构编号
	 */
	private String orgId;
	/**
	 * 默认角色编号
	 */
	private String defaultRoleId;
	/**
	 * 当前角色编号
	 */
	private String currentRoleId;
	/**
	 * 创建人
	 */
	private String createUser;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新人
	 */
	private String modifyUser;
	/**
	 * 更新时间
	 */
	private Date modifyTime;
	/**
	 * 有效标识(1:有效  0:失效)
	 */
	private String active;

	/**
	 * 设置：编号
	 */
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	/**
	 * 获取：编号
	 */
	public String getObjectId() {
		return objectId;
	}
	/**
	 * 设置：用户编号
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户编号
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：组织架构编号
	 */
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	/**
	 * 获取：组织架构编号
	 */
	public String getOrgId() {
		return orgId;
	}
	/**
	 * 设置：默认角色编号
	 */
	public void setDefaultRoleId(String defaultRoleId) {
		this.defaultRoleId = defaultRoleId;
	}
	/**
	 * 获取：默认角色编号
	 */
	public String getDefaultRoleId() {
		return defaultRoleId;
	}
	/**
	 * 设置：当前角色编号
	 */
	public void setCurrentRoleId(String currentRoleId) {
		this.currentRoleId = currentRoleId;
	}
	/**
	 * 获取：当前角色编号
	 */
	public String getCurrentRoleId() {
		return currentRoleId;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreateUser() {
		return createUser;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：更新人
	 */
	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}
	/**
	 * 获取：更新人
	 */
	public String getModifyUser() {
		return modifyUser;
	}
	/**
	 * 设置：更新时间
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getModifyTime() {
		return modifyTime;
	}
	/**
	 * 设置：有效标识(1:有效  0:失效)
	 */
	public void setActive(String active) {
		this.active = active;
	}
	/**
	 * 获取：有效标识(1:有效  0:失效)
	 */
	public String getActive() {
		return active;
	}
}
