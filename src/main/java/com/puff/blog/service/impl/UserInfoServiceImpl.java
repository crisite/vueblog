package com.puff.blog.service.impl;

import com.puff.blog.mapper.UserInfoMapper;
import com.puff.blog.model.User;
import com.puff.blog.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public String getUsername() {
        return  userInfoMapper.getUsername();
    }

    @Override
    public List<User> getUserList() {
        return userInfoMapper.getUserList();
    }
}
