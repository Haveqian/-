package com.qian.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qian.common.utils.PageUtils;
import com.qian.gulimallorder.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author Haveqian
 * @email 920852031@qq.com
 * @date 2022-03-21 20:29:06
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

