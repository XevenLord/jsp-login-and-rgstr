package com.chathumal.jsploginandregistration.service;

import com.chathumal.jsploginandregistration.entity.User;

import java.util.List;

/**
 * @author Chathumal Jayasingha | [chathumaljayasingha@hotmail.com]
 * @since - 3/25/22 | 2022-March-25[Friday]
 */
public interface UserService {
    void save(User user);
    User findByUsername(String username);

    List<User> findAll();

}
