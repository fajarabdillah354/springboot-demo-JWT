package com.springboot_jwt_example.dto;


import com.springboot_jwt_example.helper.UserAuditorListener;



public class RegisterUserDto extends UserAuditorListener<String> {

    private String email;

    private String password;

    private String fullName;


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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


}
