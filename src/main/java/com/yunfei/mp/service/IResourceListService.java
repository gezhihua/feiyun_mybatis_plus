package com.yunfei.mp.service;


import com.baomidou.mybatisplus.service.IService;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.entity.ResourceListEntity;

import java.util.Map;

/**
 * 资源集合表 
 *
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:51
 */
public interface IResourceListService extends IService<ResourceListEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

