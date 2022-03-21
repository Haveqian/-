package com.qian.gulimallmember.dao;

import com.qian.gulimallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Haveqian
 * @email 920852031@qq.com
 * @date 2022-03-21 20:57:32
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
