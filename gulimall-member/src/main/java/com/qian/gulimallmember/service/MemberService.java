package com.qian.gulimallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qian.common.utils.PageUtils;
import com.qian.gulimallmember.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author Haveqian
 * @email 920852031@qq.com
 * @date 2022-03-21 20:57:32
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

