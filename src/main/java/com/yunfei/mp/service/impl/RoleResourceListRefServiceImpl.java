package com.yunfei.mp.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.common.utils.Query;
import com.yunfei.mp.entity.RoleResourceListRefEntity;
import com.yunfei.mp.mapper.RoleResourceListRefMapper;
import com.yunfei.mp.service.IRoleResourceListRefService;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service("roleResourceListRefService")
public class RoleResourceListRefServiceImpl extends ServiceImpl<RoleResourceListRefMapper, RoleResourceListRefEntity> implements IRoleResourceListRefService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RoleResourceListRefEntity> page = this.selectPage(
                new Query<RoleResourceListRefEntity>(params).getPage(),
                new EntityWrapper<RoleResourceListRefEntity>()
        );

        return new PageUtils(page);
    }

}
