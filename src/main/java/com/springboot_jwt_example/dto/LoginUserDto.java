package com.springboot_jwt_example.dto;


import com.springboot_jwt_example.helper.UserAuditorListener;



public class LoginUserDto extends UserAuditorListener<String> {

    private String email;

    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
