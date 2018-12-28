package com.yunfei.mp.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yunfei.mp.common.utils.PageUtils;
import com.yunfei.mp.common.utils.Query;
import com.yunfei.mp.entity.AccountEntity;
import com.yunfei.mp.mapper.AccountMapper;
import com.yunfei.mp.service.IAccountService;
import org.springframework.stereotype.Service;
import java.util.Map;



@Service("accountService")
public class AccountServiceImpl extends ServiceImpl<AccountMapper, AccountEntity> implements IAccountService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AccountEntity> page = this.selectPage(
                new Query<AccountEntity>(params).getPage(),
                new EntityWrapper<AccountEntity>()
        );

        return new PageUtils(page);
    }

}
