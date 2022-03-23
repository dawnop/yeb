package com.dawnop.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dawnop.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dawnop
 * @since 2021-11-24
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<Menu> getMenusByAdminId(Integer id);
}
