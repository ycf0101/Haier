package com.service;

import com.entity.Person;
import com.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author 袁成飞
 * @create 2018-05-14 20:18
 **/
@Service
public class TestService {

    @Autowired
    private TestMapper mapper;

    public Person getPerson(String id){
        Person person = new Person("a","张三","qq.com");
        mapper.savePerson(person);
        return mapper.getPerson(id);
    }

}
