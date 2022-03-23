package com.dawnop.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dawnop.server.pojo.Admin;
import com.dawnop.server.pojo.Menu;
import com.dawnop.server.pojo.RespBean;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dawnop
 * @since 2021-11-24
 */
public interface IAdminService extends IService<Admin> {

    /**
     * 登录之后返回 token
     */

    RespBean login(String username, String password, String code, HttpServletRequest request);

    /**
     * 根据用户名 获取用户
     */
    Admin getAdminByUsername(String username);


}
