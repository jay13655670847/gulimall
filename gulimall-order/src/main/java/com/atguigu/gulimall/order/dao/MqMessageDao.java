package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author lj
 * @email lj@gmail.com
 * @date 2021-03-12 10:53:03
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
