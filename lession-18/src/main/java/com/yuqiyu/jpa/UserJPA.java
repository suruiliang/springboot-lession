package com.yuqiyu.jpa;

import com.yuqiyu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Administrator on 2018/4/22/022.
 */
public interface UserJPA extends JpaRepository<User, String> {

    @Query("SELECT u FROM User u WHERE LOWER(u.username) = LOWER(:username)")
    User findByUsernameCaseInsensitive(@Param("username") String username);

}
