package com.puff.blog.mapper;

import com.puff.blog.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    String getUsername();

    List<User> getUserList();

}
