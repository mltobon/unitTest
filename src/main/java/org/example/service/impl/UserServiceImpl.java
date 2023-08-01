package org.example.service.impl;

import org.example.domain.enums.Role;
import org.example.domain.models.User;
import org.example.service.UserService;

import java.util.Collection;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUsers() {
        return List.of(new User("Monica","127893", Role.DOCENTE));
    }
}
