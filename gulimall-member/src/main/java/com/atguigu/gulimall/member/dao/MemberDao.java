package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lj
 * @email lj@gmail.com
 * @date 2021-03-12 11:11:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
