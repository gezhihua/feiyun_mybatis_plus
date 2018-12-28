package com.yunfei.mp.service;

import com.baomidou.mybatisplus.service.IService;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.entity.UserUserEntity;

import java.util.Map;

/**
 * 用户详情表 
 *
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:52
 */
public interface IUserUserService extends IService<UserUserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

