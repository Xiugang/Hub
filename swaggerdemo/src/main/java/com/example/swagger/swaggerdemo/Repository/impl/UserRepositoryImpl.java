package com.example.swagger.swaggerdemo.Repository.impl;

import com.example.swagger.swaggerdemo.Repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

/**
 * created by DSEF on 2018/5/23.
 **/
@Repository
public  class UserRepositoryImpl implements UserRepository {
    public  static List<String> Namelist = new LinkedList<>();

    @Override
    public String AddName(String name) {
        Namelist.add(name);
        return name;
    }

    @Override
    public String DeleteName(String name1){
        Namelist.remove(name1);
        return name1;
    }

}
