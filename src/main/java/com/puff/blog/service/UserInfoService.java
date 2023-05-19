package com.puff.blog.service;

import com.puff.blog.model.User;

import java.util.List;

public interface UserInfoService {
    String getUsername();
    List<User> getUserList();
}
