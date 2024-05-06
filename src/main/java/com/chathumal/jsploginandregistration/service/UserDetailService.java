package com.chathumal.jsploginandregistration.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author Chathumal Jayasingha | [chathumaljayasingha@hotmail.com]
 * @since - 3/25/22 | 2022-March-25[Friday]
 */

public interface UserDetailService extends UserDetailsService {

    UserDetails loadUserByUsername(String username);
}
