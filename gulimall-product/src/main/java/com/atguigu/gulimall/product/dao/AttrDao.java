package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author lj
 * @email lj@gmail.com
 * @date 2021-03-12 11:04:07
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
