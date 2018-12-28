package com.yunfei.mp.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.common.utils.Query;
import com.yunfei.mp.entity.OrganizationEntity;
import com.yunfei.mp.mapper.OrganizationMapper;
import com.yunfei.mp.service.IOrganizationService;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service("organizationService")
public class OrganizationServiceImpl extends ServiceImpl<OrganizationMapper, OrganizationEntity> implements IOrganizationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<OrganizationEntity> page = this.selectPage(
                new Query<OrganizationEntity>(params).getPage(),
                new EntityWrapper<OrganizationEntity>()
        );

        return new PageUtils(page);
    }

}
