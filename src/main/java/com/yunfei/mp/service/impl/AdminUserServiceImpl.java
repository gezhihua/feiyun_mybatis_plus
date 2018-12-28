package com.yunfei.mp.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.common.utils.Query;
import com.yunfei.mp.entity.AdminUserEntity;
import com.yunfei.mp.mapper.AdminUserMapper;
import com.yunfei.mp.service.IAdminUserService;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service("adminUserService")
public class AdminUserServiceImpl extends ServiceImpl<AdminUserMapper, AdminUserEntity> implements IAdminUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AdminUserEntity> page = this.selectPage(
                new Query<AdminUserEntity>(params).getPage(),
                new EntityWrapper<AdminUserEntity>()
        );

        return new PageUtils(page);
    }

}
