package com.yunfei.mp.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yunfei.mp.entity.AccountEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * 账号表 
 * 
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:52
 */
@Mapper
public interface AccountMapper extends BaseMapper<AccountEntity> {
	
}
