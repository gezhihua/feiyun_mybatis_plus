package com.yunfei.mp.entity;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 维保商用户详情表 
 * 
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:51
 */
@TableName("maintenant_user")
public class MaintenantUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private String objectId;
	/**
	 * 账号编号
	 */
	private String accountId;
	/**
	 * 手机号
	 */
	private String mobilePhone;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 性别(1:男  0:女)
	 */
	private String sex;
	/**
	 * 头像
	 */
	private String profile;
	/**
	 * 企业
	 */
	private String maintenantId;
	/**
	 * 角色
	 */
	private String roleId;
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
	 * 是否有效(1:有效  0:失效)
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
	 * 设置：账号编号
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	/**
	 * 获取：账号编号
	 */
	public String getAccountId() {
		return accountId;
	}
	/**
	 * 设置：手机号
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	/**
	 * 获取：手机号
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}
	/**
	 * 设置：姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：姓名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：性别(1:男  0:女)
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 获取：性别(1:男  0:女)
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 设置：头像
	 */
	public void setProfile(String profile) {
		this.profile = profile;
	}
	/**
	 * 获取：头像
	 */
	public String getProfile() {
		return profile;
	}
	/**
	 * 设置：企业
	 */
	public void setMaintenantId(String maintenantId) {
		this.maintenantId = maintenantId;
	}
	/**
	 * 获取：企业
	 */
	public String getMaintenantId() {
		return maintenantId;
	}
	/**
	 * 设置：角色
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	/**
	 * 获取：角色
	 */
	public String getRoleId() {
		return roleId;
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
	 * 设置：是否有效(1:有效  0:失效)
	 */
	public void setActive(String active) {
		this.active = active;
	}
	/**
	 * 获取：是否有效(1:有效  0:失效)
	 */
	public String getActive() {
		return active;
	}
}
