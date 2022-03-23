package com.dawnop.server.service.impl;

import com.dawnop.server.pojo.Employee;
import com.dawnop.server.mapper.EmployeeMapper;
import com.dawnop.server.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dawnop
 * @since 2021-11-24
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
