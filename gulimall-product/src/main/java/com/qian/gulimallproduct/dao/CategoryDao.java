package com.qian.gulimallproduct.dao;

import com.qian.gulimallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 商品三级分类
 * 
 * @author Haveqian
 * @email 920852031@qq.com
 * @date 2022-03-21 19:31:39
 */
@Mapper
@Component
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
