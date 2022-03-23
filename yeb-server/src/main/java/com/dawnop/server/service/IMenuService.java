package com.dawnop.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dawnop.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dawnop
 * @since 2021-11-24
 */
public interface IMenuService extends IService<Menu> {

    /**
     * 根据用户 id 查询菜单列表
     */
    List<Menu> getMenusByAdminId();
}
