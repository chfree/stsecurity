package com.tennetcn.stsecurity.demo.logical.service.impl;

import com.tennetcn.stsecurity.demo.logical.model.User;
import com.tennetcn.stsecurity.demo.logical.service.IUserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Override
    public User getUserInfo(User user) {
        return null;
    }

    @Override
    public User loadUserByUsername(String s) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
