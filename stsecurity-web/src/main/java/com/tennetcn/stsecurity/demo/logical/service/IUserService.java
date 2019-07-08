package com.tennetcn.stsecurity.demo.logical.service;

import com.tennetcn.stsecurity.demo.logical.model.User;

import java.util.List;

public interface IUserService {
    User getUserInfo(User user);

    User loadUserByUsername(String s);

    List<User> getAllUsers();
}
