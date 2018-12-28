package com.yunfei.mp.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.common.utils.Query;
import com.yunfei.mp.entity.MaintenantUserEntity;
import com.yunfei.mp.mapper.MaintenantUserMapper;
import com.yunfei.mp.service.IMaintenantUserService;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service("maintenantUserService")
public class MaintenantUserServiceImpl extends ServiceImpl<MaintenantUserMapper, MaintenantUserEntity> implements IMaintenantUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MaintenantUserEntity> page = this.selectPage(
                new Query<MaintenantUserEntity>(params).getPage(),
                new EntityWrapper<MaintenantUserEntity>()
        );

        return new PageUtils(page);
    }

}
