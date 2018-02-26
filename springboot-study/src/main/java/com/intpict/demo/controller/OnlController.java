package com.intpict.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: linsen
 * Date: 18/1/24
 * Time: 下午3:00
 * Description:
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String getE() {
        return "Hello World 10086！";
    }

}
