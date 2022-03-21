package com.qian.gulimallcoupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qian.common.utils.PageUtils;
import com.qian.common.utils.Query;

import com.qian.gulimallcoupon.dao.SmsCouponSpuCategoryRelationDao;
import com.qian.gulimallcoupon.entity.SmsCouponSpuCategoryRelationEntity;
import com.qian.gulimallcoupon.service.SmsCouponSpuCategoryRelationService;


@Service("smsCouponSpuCategoryRelationService")
public class SmsCouponSpuCategoryRelationServiceImpl extends ServiceImpl<SmsCouponSpuCategoryRelationDao, SmsCouponSpuCategoryRelationEntity> implements SmsCouponSpuCategoryRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsCouponSpuCategoryRelationEntity> page = this.page(
                new Query<SmsCouponSpuCategoryRelationEntity>().getPage(params),
                new QueryWrapper<SmsCouponSpuCategoryRelationEntity>()
        );

        return new PageUtils(page);
    }

}