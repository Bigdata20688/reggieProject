package edu.czjt.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.czjt.reggie.entity.Employee;
import edu.czjt.reggie.mapper.EmployeeMapper;
import edu.czjt.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * 作者：付梦媛
 * 内容：员工管理
 * 日期：2023/6/15
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
