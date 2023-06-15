package edu.czjt.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.czjt.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * 张权 菜品
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
