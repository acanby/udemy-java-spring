package com.canby.spring.web.service;

import com.canby.spring.web.dao.User;
import com.canby.spring.web.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by acanby on 6/07/2015.
 */
@Service("usersService")
public class UsersService {

    private final UserDao userDao;

    public UsersService() {
        this(null);
    }

    @Autowired
    public UsersService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void create(User user) {
        userDao.create(user);
    }

    public boolean exists(String username) {
        return userDao.exists(username);
    }

    @Secured("ROLE_ADMIN")
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
