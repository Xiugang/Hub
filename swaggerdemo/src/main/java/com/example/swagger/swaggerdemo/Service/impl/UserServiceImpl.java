package com.example.swagger.swaggerdemo.Service.impl;

import com.example.swagger.swaggerdemo.Repository.UserRepository;
import com.example.swagger.swaggerdemo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * created by DSEF on 2018/5/24.
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public String Addname(String name) {
//        userRepository.AddName(name);
        return  userRepository.AddName(name);
    }

    @Override
    public String Deletename(String name1) {
//        userRepository.DeleteName(name1);
        return  userRepository.DeleteName(name1);
    }


}
