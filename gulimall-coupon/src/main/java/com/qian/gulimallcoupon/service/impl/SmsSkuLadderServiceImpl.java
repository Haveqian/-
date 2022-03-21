package com.qian.gulimallcoupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qian.common.utils.PageUtils;
import com.qian.common.utils.Query;

import com.qian.gulimallcoupon.dao.SmsSkuLadderDao;
import com.qian.gulimallcoupon.entity.SmsSkuLadderEntity;
import com.qian.gulimallcoupon.service.SmsSkuLadderService;


@Service("smsSkuLadderService")
public class SmsSkuLadderServiceImpl extends ServiceImpl<SmsSkuLadderDao, SmsSkuLadderEntity> implements SmsSkuLadderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSkuLadderEntity> page = this.page(
                new Query<SmsSkuLadderEntity>().getPage(params),
                new QueryWrapper<SmsSkuLadderEntity>()
        );

        return new PageUtils(page);
    }

}