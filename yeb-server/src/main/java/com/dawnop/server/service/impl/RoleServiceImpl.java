package com.dawnop.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dawnop.server.mapper.RoleMapper;
import com.dawnop.server.pojo.Role;
import com.dawnop.server.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
