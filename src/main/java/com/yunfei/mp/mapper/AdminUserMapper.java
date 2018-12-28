package com.yunfei.mp.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yunfei.mp.entity.AdminUserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 管理员用户详情表 
 * 
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:52
 */
@Mapper
public interface AdminUserMapper extends BaseMapper<AdminUserEntity> {
	
}
