package edu.czjt.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.czjt.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * 作者：付梦媛
 * 内容：员工管理
 * 日期：2023/6/15
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
