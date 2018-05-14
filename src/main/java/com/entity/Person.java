package com.entity;


import lombok.Data;

/**
 * ${DESCRIPTION}
 *
 * @author 袁成飞
 * @create 2018-05-14 20:20
 **/
@Data
public class Person {
    private String id;
    private String name;
    private String address;

    public Person(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}