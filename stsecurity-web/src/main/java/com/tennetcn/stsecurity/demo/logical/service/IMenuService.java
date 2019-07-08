package com.tennetcn.stsecurity.demo.logical.service;

import com.tennetcn.stsecurity.demo.logical.model.Menu;

import java.util.List;

public interface IMenuService {
    List<Menu> getMenusByUserId(String userId);
}
