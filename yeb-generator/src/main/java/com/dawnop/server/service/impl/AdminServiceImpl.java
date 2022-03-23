package com.dawnop.server.service.impl;

import com.dawnop.server.pojo.Admin;
import com.dawnop.server.mapper.AdminMapper;
import com.dawnop.server.service.IAdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
