package com.yunfei.mp.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yunfei.mp.entity.ResourceListEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * 资源集合表 
 * 
 * @author rasonboy
 * @email rasonboy@freedotech.com
 * @date 2018-12-24 09:58:51
 */
@Mapper
public interface ResourceListMapper extends BaseMapper<ResourceListEntity> {
	
}
