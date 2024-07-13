package com.nxj.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nxj.api.mapper.UserMapper;
import com.nxj.api.model.entity.User;
import com.nxj.api.service.UserService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
* @author niexingju
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2024-07-12 09:55:53
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Override
    public User getLoginUser(HttpServletRequest request) {
        return null;
    }

    @Override
    public boolean isAdmin(HttpServletRequest request) {
        return false;
    }
}




