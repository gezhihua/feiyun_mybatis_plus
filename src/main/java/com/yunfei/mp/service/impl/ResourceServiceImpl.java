package com.yunfei.mp.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.common.utils.Query;
import com.yunfei.mp.entity.ResourceEntity;
import com.yunfei.mp.mapper.ResourceMapper;
import com.yunfei.mp.service.IResourceService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("resourceService")
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, ResourceEntity> implements IResourceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ResourceEntity> page = this.selectPage(
                new Query<ResourceEntity>(params).getPage(),
                new EntityWrapper<ResourceEntity>()
        );

        return new PageUtils(page);
    }

}
