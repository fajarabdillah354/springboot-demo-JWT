package com.springboot_jwt_example.service;


import com.springboot_jwt_example.dto.LoginUserDto;
import com.springboot_jwt_example.dto.RegisterUserDto;
import com.springboot_jwt_example.entity.Users;
import com.springboot_jwt_example.repository.UsersRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthenticationService {
    private final UsersRepository usersRepository;

    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;

    public AuthenticationService(
            UsersRepository userRepository,
            AuthenticationManager authenticationManager,
            PasswordEncoder passwordEncoder) {
        this.authenticationManager = authenticationManager;
        this.usersRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    //REGISTER
    public Users signup(RegisterUserDto input) {
        Users user = new Users();
        user.setFullName(input.getFullname());
        user.setEmail(input.getEmail());
        user.setPassword(passwordEncoder.encode(input.getPassword()));


        return usersRepository.save(user);
    }


    //LOGIN
    public Users authenticate(LoginUserDto input) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.getEmail(),
                        input.getPassword()
                )
        );

        return usersRepository.findByEmail(input.getEmail())
                .orElseThrow();
    }


    //GETALL
    public List<Users> getUser(){
        return usersRepository.findAll();
    }


}
