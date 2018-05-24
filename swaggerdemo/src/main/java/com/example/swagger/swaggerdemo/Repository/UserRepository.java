package com.example.swagger.swaggerdemo.Repository;

import com.example.swagger.swaggerdemo.Repository.impl.UserRepositoryImpl;
import java.util.List;

/**
 * created by DSEF on 2018/5/23.
 **/
public interface UserRepository {
    String AddName(String name);
    String DeleteName(String name2);

}
