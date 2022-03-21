package com.qian.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qian.common.utils.PageUtils;
import com.qian.gulimallcoupon.entity.SmsSeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author Haveqian
 * @email 920852031@qq.com
 * @date 2022-03-21 20:40:07
 */
public interface SmsSeckillPromotionService extends IService<SmsSeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

