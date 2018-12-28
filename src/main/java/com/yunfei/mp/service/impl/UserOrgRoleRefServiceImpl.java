package com.yunfei.mp.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.common.utils.Query;
import com.yunfei.mp.entity.UserOrgRoleRefEntity;
import com.yunfei.mp.mapper.UserOrgRoleRefMapper;
import com.yunfei.mp.service.IUserOrgRoleRefService;
import org.springframework.stereotype.Service;
import java.util.Map;



@Service("userOrgRoleRefService")
public class UserOrgRoleRefServiceImpl extends ServiceImpl<UserOrgRoleRefMapper, UserOrgRoleRefEntity> implements IUserOrgRoleRefService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<UserOrgRoleRefEntity> page = this.selectPage(
                new Query<UserOrgRoleRefEntity>(params).getPage(),
                new EntityWrapper<UserOrgRoleRefEntity>()
        );

        return new PageUtils(page);
    }

}
