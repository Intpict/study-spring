package com.intpict.demo.service;

import com.intpict.demo.dao.IDepartmentDao;
import com.intpict.demo.dao.IEmpDao;
import com.intpict.demo.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Emp getById(int id) {
        return empDao.selectByPrimaryKey(id);
    }

}
