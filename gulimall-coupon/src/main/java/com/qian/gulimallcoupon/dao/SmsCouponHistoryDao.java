package com.qian.gulimallcoupon.dao;

import com.qian.gulimallcoupon.entity.SmsCouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author Haveqian
 * @email 920852031@qq.com
 * @date 2022-03-21 20:40:06
 */
@Mapper
public interface SmsCouponHistoryDao extends BaseMapper<SmsCouponHistoryEntity> {
	
}
