package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author lj
 * @email lj@gmail.com
 * @date 2021-03-12 10:53:02
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
