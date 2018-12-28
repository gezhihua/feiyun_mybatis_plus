package com.yunfei.mp.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yunfei.mp.entity.UserOrgRoleRefEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户组织架构角色关联表 
 * 
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:51
 */
@Mapper
public interface UserOrgRoleRefMapper extends BaseMapper<UserOrgRoleRefEntity> {
	
}
