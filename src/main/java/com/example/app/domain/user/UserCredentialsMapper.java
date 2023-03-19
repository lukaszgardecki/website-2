package com.example.app.domain.user;

import com.example.app.domain.user.dto.UserCredentialsDto;

import java.util.Set;
import java.util.stream.Collectors;

public class UserCredentialsMapper {

    static UserCredentialsDto map(User user) {
        String email = user.getEmail();
        String password = user.getPasword();
        Set<String> roles = user.getRoles().stream().map(UserRole::getName).collect(Collectors.toSet());
        return new UserCredentialsDto(email, password, roles);
    }
}
