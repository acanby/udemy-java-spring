package com.canby.spring.web.dao;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by acanby on 6/07/2015.
 */
public class User {
    @NotNull(message = "Can't have an empty username")
    @Pattern(regexp = "^\\w{8,15}$", message = "Username must be alphanumeric, and between 8-15 characters")
    private String username;

    @NotNull
    @Length(min = 8, max = 60)
    @Pattern(regexp = "\\w{8,60}", message = "Password must be 8-60 chars")
    private String password;

    @Email
    private String email;

    private Boolean enabled;
    private String authority;

    public User() {

    }

    public User(String username, String password, String email, Boolean enabled, String authority) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.enabled = enabled;
        this.authority = authority;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
