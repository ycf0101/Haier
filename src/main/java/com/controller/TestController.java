package com.controller;

import com.entity.Person;
import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ${DESCRIPTION}
 *
 * @author 袁成飞
 * @create 2018-05-14 20:17
 **/
@Controller
public class TestController {

    @Autowired
    private TestService service;

    @RequestMapping("/index")
    @ResponseBody
    public void testIndex(){
        Person person = service.getPerson("1");
        System.out.println(person);
    }

}
