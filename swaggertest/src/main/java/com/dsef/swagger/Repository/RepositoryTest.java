package com.dsef.swagger.Repository;

import org.springframework.stereotype.Repository;

import java.util.LinkedList;

/**
 * created by DSEF on 2018/5/22.
 **/
@Repository
public class RepositoryTest {
    public static LinkedList<String> namelist = new LinkedList<>();
    public void addname(String na){
        namelist.add(na);
    }
}
