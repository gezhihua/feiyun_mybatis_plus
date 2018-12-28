package com.yunfei.mp.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.common.utils.Query;
import com.yunfei.mp.entity.MaintenantEntity;
import com.yunfei.mp.mapper.MaintenantMapper;
import com.yunfei.mp.service.IMaintenantService;
import org.springframework.stereotype.Service;
import java.util.Map;


@Service("maintenantService")
public class MaintenantServiceImpl extends ServiceImpl<MaintenantMapper, MaintenantEntity> implements IMaintenantService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MaintenantEntity> page = this.selectPage(
                new Query<MaintenantEntity>(params).getPage(),
                new EntityWrapper<MaintenantEntity>()
        );

        return new PageUtils(page);
    }

}
