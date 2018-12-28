package com.yunfei.mp.service;

import com.baomidou.mybatisplus.service.IService;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.entity.UserOrgRoleRefEntity;

import java.util.Map;

/**
 * 用户组织架构角色关联表 
 *
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:51
 */
public interface IUserOrgRoleRefService extends IService<UserOrgRoleRefEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

