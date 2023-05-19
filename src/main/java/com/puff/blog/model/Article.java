package com.puff.blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {

    private int aId;

    private int uId;

    private String title;

    private String content;

    private Date createtime;

    private boolean status;
}
