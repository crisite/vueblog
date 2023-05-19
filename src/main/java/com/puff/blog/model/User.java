package com.puff.blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;

    private String username;

    private String password;

    private String avatar;

    private String nickname;

    private Date createTime;

    private boolean status;
}
