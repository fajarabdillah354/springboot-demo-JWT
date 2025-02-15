package com.springboot_jwt_example.service;


import com.springboot_jwt_example.entity.Users;
import com.springboot_jwt_example.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UsersRepository usersRepository;

    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    public List<Users> allUsers() {

        return new ArrayList<>(usersRepository.findAll());
    }

}
