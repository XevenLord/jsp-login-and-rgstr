package com.chathumal.jsploginandregistration.repo;

import com.chathumal.jsploginandregistration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Chathumal Jayasingha | [chathumaljayasingha@hotmail.com]
 * @since - 3/25/22 | 2022-March-25[Friday]
 */

public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
