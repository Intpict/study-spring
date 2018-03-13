package com.intpict.demo.service;

import com.intpict.demo.dao.IDepartmentDao;
import com.intpict.demo.dao.IEmpDao;
import com.intpict.demo.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: linsen
 * Date: 18/2/24
 * Time: 下午4:04
 * Description:
 */
@Service
public class OnlService {

    @Autowired
    private IEmpDao empDao;

    @Autowired
    private IDepartmentDao departmentDao;

    public Emp getById(int id) {
        return empDao.selectByPrimaryKey(id);
    }

    public List<Emp> getByName(String name) {
        return empDao.selectByName(name, "ls_emp");
    }

    public String updateById(String id) {
        Emp emp = empDao.selectByPrimaryKey(Integer.valueOf(id));
        emp.setDepartmentNo("02");
        int ans = empDao.updateByPrimaryKey(emp);
        return (ans > 0) ? "success" : "false";
    }

}
