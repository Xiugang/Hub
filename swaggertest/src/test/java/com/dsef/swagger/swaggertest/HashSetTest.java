package com.dsef.swagger.swaggertest;

import java.util.HashSet;

/**
 * created by DSEF on 2018/5/21.
 **/
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> nn = new HashSet<>();
        nn.add("a");
        nn.add("b");
        nn.add("c");
        nn.add("d");
        nn.remove("c");
//        for (String i:nn) {
//            System.out.println(i);
//        }

        System.out.println(nn);
    }
}
