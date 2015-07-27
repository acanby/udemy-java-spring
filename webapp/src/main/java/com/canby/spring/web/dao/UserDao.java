package com.canby.spring.web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by acanby on 6/07/2015.
 */
@Component("userDao")
public class UserDao {

    private final NamedParameterJdbcTemplate jdbc;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserDao(DataSource jdbc, PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.jdbc = new NamedParameterJdbcTemplate(jdbc);
    }

    // @Transactional
    // TODO - Spring 3 requires default constructor. No time to work out how to do constructor injection, so atm no transactional on the user create
    public boolean create(User user) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("username", user.getUsername());
        params.addValue("password", passwordEncoder.encode(user.getPassword()));
        params.addValue("email", user.getEmail());
        params.addValue("enabled", user.getEnabled());
        params.addValue("authority", user.getAuthority());


        jdbc.update("INSERT INTO USERS (username, password, email, enabled) VALUES (:username, :password, :email, :enabled)", params);
        return jdbc.update("INSERT INTO AUTHORITIES (username, authority) VALUES (:username, :authority)", params) == 1;
    }

    public boolean exists(String username) {
        return jdbc.queryForObject("select count(*) from USERS where username = :username",
                new MapSqlParameterSource("username", username),
                Integer.class) > 0;
    }

    public List<User> getAllUsers() {
        return jdbc.query("select * from users, authorities where users.username = authorities.username", BeanPropertyRowMapper.newInstance(User.class));
    }
}
