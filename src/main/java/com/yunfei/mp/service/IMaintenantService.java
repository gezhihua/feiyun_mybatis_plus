package com.yunfei.mp.service;

import com.baomidou.mybatisplus.service.IService;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.entity.MaintenantEntity;


import java.util.Map;

/**
 * 维保商表 
 *
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:51
 */
public interface IMaintenantService extends IService<MaintenantEntity> {
    PageUtils queryPage(Map<String, Object> params);
}

