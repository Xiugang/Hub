package com.dsef.swagger.swaggertest;

import java.util.HashMap;

/**
 * created by DSEF on 2018/5/21.
 **/
public class MapTest {

//    static HashMap func(HashMap as) {
//        for (int i = 0; i < 4; i++) {
//            as.put(i, i);
//        }
//        return as;
//    }

    public static void main(String[] args) {

        HashMap ss =new HashMap();
        HashMap m=func(ss);
        System.out.println(m);

        System.out.println(m.get(2));
        m.remove(1);
        System.out.println(m);

    }

    static HashMap func(HashMap as) {
        for (int i = 0; i < 4; i++) {
            as.put(i, i);
        }
        return as;
    }
}