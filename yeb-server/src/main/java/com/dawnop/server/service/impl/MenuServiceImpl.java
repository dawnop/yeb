package com.dawnop.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dawnop.server.mapper.MenuMapper;
import com.dawnop.server.pojo.Admin;
import com.dawnop.server.pojo.Menu;
import com.dawnop.server.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dawnop
 * @since 2021-11-24
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {


    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private MenuMapper menuMapper;

    @SuppressWarnings("rawtypes")
    @Autowired
    private RedisTemplate redisTemplate;

    @SuppressWarnings("unchecked")
    @Override
    public List<Menu> getMenusByAdminId() {
        Integer adminId = ((Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal())
                .getId();
        // 从 redis 获取 菜单数据 如果为空 则 从 redis 获取数据
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        List<Menu> menes = ((List<Menu>) valueOperations.get("menu_" + adminId));
        if (CollectionUtils.isEmpty(menes)) {
            menes = menuMapper.getMenusByAdminId(adminId);
            // 将数据 存储到 redis
            valueOperations.set("menu_" + adminId, menes);
        }
        return menes;
    }
}
