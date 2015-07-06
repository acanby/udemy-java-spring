package com.canby.spring.web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

/**
 * Created by acanby on 6/07/2015.
 */
@Component("userDao")
public class UserDao {

    private final NamedParameterJdbcTemplate jdbc;

    @Autowired
    public UserDao(DataSource jdbc) {
        this.jdbc = new NamedParameterJdbcTemplate(jdbc);
    }

    @Transactional
    public boolean create(User user) {
        BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(user);

        jdbc.update("INSERT INTO USERS (username, password, email, enabled) VALUES (:username, :password, :email, :enabled)", params);
        return jdbc.update("INSERT INTO AUTHORITIES (username, authority) VALUES (:username, :authority)", params) == 1;
    }
}
