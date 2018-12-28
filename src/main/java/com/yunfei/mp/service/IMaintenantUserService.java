package com.yunfei.mp.service;

import com.baomidou.mybatisplus.service.IService;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.entity.MaintenantUserEntity;

import java.util.Map;

/**
 * 维保商用户详情表 
 *
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:51
 */
public interface IMaintenantUserService extends IService<MaintenantUserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

