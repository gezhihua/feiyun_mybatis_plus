package com.yunfei.mp.service.impl;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.common.utils.Query;
import com.yunfei.mp.entity.UserUserEntity;
import com.yunfei.mp.mapper.UserUserMapper;
import com.yunfei.mp.service.IUserUserService;
import org.springframework.stereotype.Service;
import java.util.Map;



@Service("userUserService")
public class UserUserServiceImpl extends ServiceImpl<UserUserMapper, UserUserEntity> implements IUserUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<UserUserEntity> page = this.selectPage(
                new Query<UserUserEntity>(params).getPage(),
                new EntityWrapper<UserUserEntity>()
        );

        return new PageUtils(page);
    }

}
