package com.intpict.demo.controller;

import com.intpict.demo.entity.Emp;
import com.intpict.demo.service.OnlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping(value = "/hello/select/{name}", method = RequestMethod.GET)
    public String getEmp(@PathVariable("name") String name) {
        List<Emp> res = onlService.getByName(name);
        return res.get(0).getId().toString();
    }

    @RequestMapping(value = "/hello/update/{id}", method = RequestMethod.GET)
    public String updateEmp(@PathVariable("id") String id) {
        return onlService.updateById(id);
    }

}
