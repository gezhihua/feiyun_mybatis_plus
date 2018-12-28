package com.yunfei.mp.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色资源集合关联表 
 * 
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:51
 */
@TableName("role_resource_list_ref")
public class RoleResourceListRefEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private String objectId;
	/**
	 * 角色编号
	 */
	private String roleId;
	/**
	 * 资源集合编号
	 */
	private String resourceListId;
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
	 * 设置：角色编号
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	/**
	 * 获取：角色编号
	 */
	public String getRoleId() {
		return roleId;
	}
	/**
	 * 设置：资源集合编号
	 */
	public void setResourceListId(String resourceListId) {
		this.resourceListId = resourceListId;
	}
	/**
	 * 获取：资源集合编号
	 */
	public String getResourceListId() {
		return resourceListId;
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