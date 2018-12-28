package com.yunfei.mp.service;


import com.baomidou.mybatisplus.service.IService;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.entity.ResourceEntity;

import java.util.Map;

/**
 * 资源表 
 *
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:51
 */
public interface IResourceService extends IService<ResourceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

