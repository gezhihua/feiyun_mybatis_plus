package com.yunfei.mp.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.common.utils.Query;
import com.yunfei.mp.entity.ResourceListEntity;
import com.yunfei.mp.mapper.ResourceListMapper;
import com.yunfei.mp.service.IResourceListService;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service("resourceListService")
public class ResourceListServiceImpl extends ServiceImpl<ResourceListMapper, ResourceListEntity> implements IResourceListService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ResourceListEntity> page = this.selectPage(
                new Query<ResourceListEntity>(params).getPage(),
                new EntityWrapper<ResourceListEntity>()
        );

        return new PageUtils(page);
    }

}
