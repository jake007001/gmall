package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hujun
 * @email 506170596@qq.com
 * @date 2020-04-12 16:41:00
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
