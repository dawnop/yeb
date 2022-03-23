package com.dawnop.server.service.impl;

import com.dawnop.server.pojo.Menu;
import com.dawnop.server.mapper.MenuMapper;
import com.dawnop.server.service.IMenuService;
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
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
