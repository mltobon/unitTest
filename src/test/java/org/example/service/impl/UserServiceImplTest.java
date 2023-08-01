package org.example.service.impl;

import org.example.domain.models.User;
import org.example.service.impl.utils.Utils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {

    @Test
    void getUsers() {
        List<User> users = Utils.getUserListSimulated();
        UserServiceImpl service = new UserServiceImpl();
        users.forEach(System.out::println);
    }
}