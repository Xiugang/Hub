package com.dsef.swagger.swaggertest;

import java.util.Stack;

/**
 * created by DSEF on 2018/5/21.
 **/
public class StackDemo {
    public static void main(String[] args) {
        Stack demo = new Stack();
        demo.push("a");
        demo.push("b");
        System.out.println(demo.empty());
        System.out.println(demo.peek());
        System.out.println(demo.pop());
        System.out.println(demo.peek());
        System.out.println(demo.search("a"));
    }
}
