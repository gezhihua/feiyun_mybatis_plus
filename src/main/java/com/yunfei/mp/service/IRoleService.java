package com.yunfei.mp.service;

import com.baomidou.mybatisplus.service.IService;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.entity.RoleEntity;

import java.util.Map;

/**
 * 角色表 
 *
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:51
 */
public interface IRoleService extends IService<RoleEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

