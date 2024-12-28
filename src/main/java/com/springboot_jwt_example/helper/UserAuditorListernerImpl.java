package com.springboot_jwt_example.helper;


import com.springboot_jwt_example.entity.Users;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class UserAuditorListernerImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        Users users = (Users) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return Optional.of(users.getEmail());
    }
}
