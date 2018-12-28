package com.yunfei.mp.service;

import com.baomidou.mybatisplus.service.IService;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.entity.MeterEntity;

import java.util.Map;

/**
 * 
 *
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:52
 */
public interface IMeterService extends IService<MeterEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

