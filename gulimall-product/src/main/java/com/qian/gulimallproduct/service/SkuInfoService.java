package com.qian.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qian.common.utils.PageUtils;
import com.qian.gulimallproduct.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author Haveqian
 * @email 920852031@qq.com
 * @date 2022-03-21 19:31:39
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

