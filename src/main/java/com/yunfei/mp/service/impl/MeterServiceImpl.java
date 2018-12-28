package com.yunfei.mp.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.common.utils.Query;
import com.yunfei.mp.entity.MeterEntity;
import com.yunfei.mp.mapper.MeterMapper;
import com.yunfei.mp.service.IMeterService;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service("meterService")
public class MeterServiceImpl extends ServiceImpl<MeterMapper, MeterEntity> implements IMeterService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeterEntity> page = this.selectPage(
                new Query<MeterEntity>(params).getPage(),
                new EntityWrapper<MeterEntity>()
        );

        return new PageUtils(page);
    }

}
