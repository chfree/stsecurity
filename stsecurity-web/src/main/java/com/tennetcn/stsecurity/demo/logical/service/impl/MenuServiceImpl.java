package com.tennetcn.stsecurity.demo.logical.service.impl;

import com.tennetcn.stsecurity.demo.logical.model.Menu;
import com.tennetcn.stsecurity.demo.logical.service.IMenuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements IMenuService {
    @Override
    public List<Menu> getMenusByUserId(String userId) {
        return null;
    }
}
