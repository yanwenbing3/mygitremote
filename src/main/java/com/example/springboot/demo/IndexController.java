package com.example.springboot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @Title: IndexController
 * @ProjectName springboot1
 * @Description: TODO
 * @date 2019\2\12 001213:21
 */
@RestController
public class IndexController {
    @RequestMapping(value = "/index")
    public String index(){
        return "hello!!!";
    }
}
