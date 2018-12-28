package com.yunfei.mp.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.common.utils.Query;
import com.yunfei.mp.entity.TenantUserEntity;
import com.yunfei.mp.mapper.TenantUserMapper;
import com.yunfei.mp.service.ITenantUserService;
import org.springframework.stereotype.Service;
import java.util.Map;



@Service("tenantUserService")
public class TenantUserServiceImpl extends ServiceImpl<TenantUserMapper, TenantUserEntity> implements ITenantUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TenantUserEntity> page = this.selectPage(
                new Query<TenantUserEntity>(params).getPage(),
                new EntityWrapper<TenantUserEntity>()
        );

        return new PageUtils(page);
    }

}
