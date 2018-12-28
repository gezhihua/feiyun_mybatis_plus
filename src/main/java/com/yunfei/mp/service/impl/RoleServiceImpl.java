package com.yunfei.mp.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.common.utils.Query;
import com.yunfei.mp.entity.RoleEntity;
import com.yunfei.mp.mapper.RoleMapper;
import com.yunfei.mp.service.IRoleService;
import org.springframework.stereotype.Service;
import java.util.Map;


@Service("roleService")
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RoleEntity> implements IRoleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RoleEntity> page = this.selectPage(
                new Query<RoleEntity>(params).getPage(),
                new EntityWrapper<RoleEntity>()
        );

        return new PageUtils(page);
    }

}
