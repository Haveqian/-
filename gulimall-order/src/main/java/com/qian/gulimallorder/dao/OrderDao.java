package com.qian.gulimallorder.dao;

import com.qian.gulimallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Haveqian
 * @email 920852031@qq.com
 * @date 2022-03-21 20:29:06
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
