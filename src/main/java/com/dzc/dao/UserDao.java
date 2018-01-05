package com.dzc.dao;

import com.dzc.entity.User;

import java.util.List;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 * 开发人员: @author dongzc15247<br>
 * 开发时间: 2018-01-05<br>
 */
public interface UserDao {
    void insert(User user);
    User findUserById(int userId);
    List<User> findAllUsers();
}
