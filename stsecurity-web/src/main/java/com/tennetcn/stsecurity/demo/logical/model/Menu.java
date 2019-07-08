package com.tennetcn.stsecurity.demo.logical.model;

import lombok.Data;

@Data
public class Menu {
    private String id;

    private String name;

    private String url;

    private String icon;

    private String parentId;
}
