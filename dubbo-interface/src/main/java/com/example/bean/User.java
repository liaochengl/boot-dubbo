package com.example.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lanyang
 * @description:
 * @create: 2019-11-19 20:55
 **/
@Data
public class User implements Serializable {

    private static final long serialVersionUID =-1L;
    private int id;

    private String name;

    private String username;

    private String address;
}
