package com.dsef.swagger.swaggertest;

import java.util.concurrent.ConcurrentHashMap;

/**
 * created by DSEF on 2018/5/21.
 **/
public class ConcurrentHashMapTest {
//    static ConcurrentHashMap func1(ConcurrentHashMap con){
//        for (int i = 0; i < 5; i++) {
//            con.put(i,i);
//
//        }
//        return con;
//    }
    public static void main(String[] args) {
        ConcurrentHashMap con =new ConcurrentHashMap();
//        ConcurrentHashMap ss =func1(con);
        con.put(1,"ss");
        con.put(2,"ss2");
        System.out.println(con);
        System.out.println(con.get(2));

    }
}
