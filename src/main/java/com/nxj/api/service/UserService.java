package com.nxj.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nxj.api.model.entity.User;

import javax.servlet.http.HttpServletRequest;

/**
* @author niexingju
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2024-07-12 09:55:53
*/
public interface UserService extends IService<User> {

    User getLoginUser(HttpServletRequest request);

    boolean isAdmin(HttpServletRequest request);
}
