package com.dzc.entity;

import lombok.Data;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author dongzc15247<br>
 * 开发时间: 2018-01-05<br>
 */
@Data
public class User {
    private int id;
    private String name;
    private String password;
    private int age;
    private int deleteFlag;
}
