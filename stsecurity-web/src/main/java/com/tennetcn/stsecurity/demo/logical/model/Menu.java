package com.tennetcn.stsecurity.demo.logical.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private String id;

    private String name;

    private String url;

    private String icon;

    private String parentId;
}
