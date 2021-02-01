package com.ren.mall.tiny.service;

import com.ren.mall.tiny.mgb.model.UmsAdmin;
import com.ren.mall.tiny.mgb.model.UmsPermission;

import java.util.List;

/**
 * 后台管理员Service
 * @author : renwenhao
 * @date : 15:44 2021/1/26
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username,String password);

    /**
     * 获取用户所有的权限（包括角色权限+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);

}
