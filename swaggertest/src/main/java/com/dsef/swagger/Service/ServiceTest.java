package com.dsef.swagger.Service;

import com.dsef.swagger.Repository.RepositoryTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by DSEF on 2018/5/22.
 **/
@Service
public class ServiceTest {
    @Autowired
    RepositoryTest RepositoryTest;
    public void add(String na){
        RepositoryTest.addname(na);
    }
}