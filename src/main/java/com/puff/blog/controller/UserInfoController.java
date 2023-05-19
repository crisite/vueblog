package com.puff.blog.controller;


import com.puff.blog.service.UserInfoService;
import com.puff.blog.service.impl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoServiceImpl userInfoService;

    @GetMapping("/userinfo")
    @ResponseBody
    public String getUsername(){
        return userInfoService.getUsername();
    }

    @GetMapping("/userList")
    @ResponseBody
    public String getUserList(){
        return userInfoService.getUserList().toString();
    }
}
