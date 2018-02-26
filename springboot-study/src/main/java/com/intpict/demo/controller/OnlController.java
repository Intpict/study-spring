package com.intpict.demo.controller;

import com.intpict.demo.service.OnlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: linsen
 * Date: 18/1/24
 * Time: 下午3:00
 * Description:
 */
@RestController
public class OnlController {

    @Autowired
    private OnlService onlService;

    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    public String getEmp(@PathVariable("id") String id) {
        return onlService.getById(Integer.valueOf(id)).getName();
    }

}
