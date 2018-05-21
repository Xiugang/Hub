package com.dsef.swagger.swaggertest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * created by DSEF on 2018/5/18.
 **/
public class VectorDemo {
    public static void main(String[] args) {

        List<String> person = new ArrayList<>();
        person.add("name0");        //索引0
        person.add("name1");
        person.add("name2");
        person.add("name3");
        person.add("name4");
        Vector v1 = new Vector();
//        Vector v2 = new Vector(12);
//        Vector v3 = new Vector(12,5);
//        Vector v4 = new Vector(Arrays.asList(person));
        v1.add("sss");
        v1.add(3);
        v1.addAll(person);
        System.out.println(v1);
        v1.set(3,5);
        System.out.println(v1);
        v1.add(2,"www");
        System.out.println(v1);
//        System.out.println(v1.indexOf("www"));
//        System.out.println(v1);
//        System.out.println(v1.elementAt(3));
        System.out.println(v1.size());
        System.out.println(v1.capacity());
    }

}
