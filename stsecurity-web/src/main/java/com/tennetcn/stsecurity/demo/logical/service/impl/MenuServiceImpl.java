package com.tennetcn.stsecurity.demo.logical.service.impl;

import com.tennetcn.stsecurity.demo.logical.model.Menu;
import com.tennetcn.stsecurity.demo.logical.service.IMenuService;
import lombok.var;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements IMenuService {
    @Override
    public List<Menu> getMenusByUserId(String userId) {
        var menus = new ArrayList<Menu>();

        var menu =new Menu();
        menu.setName("首页").setUrl("/home");

        menus.add(menu);

        return menus;
    }
}
