package com.yunfei.mp.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.common.utils.Query;
import com.yunfei.mp.entity.TenantEntity;
import com.yunfei.mp.mapper.TenantMapper;
import com.yunfei.mp.service.ITenantService;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service("tenantService")
public class TenantServiceImpl extends ServiceImpl<TenantMapper, TenantEntity> implements ITenantService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TenantEntity> page = this.selectPage(
                new Query<TenantEntity>(params).getPage(),
                new EntityWrapper<TenantEntity>()
        );

        return new PageUtils(page);
    }

}
