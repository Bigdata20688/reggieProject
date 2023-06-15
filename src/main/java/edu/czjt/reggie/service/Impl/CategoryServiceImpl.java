package edu.czjt.reggie.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.czjt.reggie.entity.Category;
import edu.czjt.reggie.mapper.CategoryMapper;
import edu.czjt.reggie.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 张俊胜
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
}
