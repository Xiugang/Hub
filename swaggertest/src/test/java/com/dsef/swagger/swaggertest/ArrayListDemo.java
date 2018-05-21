package com.dsef.swagger.swaggertest;

import java.util.ArrayList;
import java.util.List;

/**
 * created by DSEF on 2018/5/18.
 **/
public class ArrayListDemo {
    public static void main(String[] args) {

        //list中添加，获取，删除元素
        List<String> person = new ArrayList<>();
        person.add("name0");        //索引0
        person.add("name1");
        person.add("name2");
        person.add("name3");
        person.add("name4");

        person.remove(3);           //.remove(index)
        person.remove("name4");         //.remove(Object o)

        String per = "";
        per = person.get(1);
        System.out.println(per);        //.get(index)

        for (int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i));
        }


        //list总是否包含某个元素
        List<String> Fruits = new ArrayList<>();
        Fruits.add("苹果");
        Fruits.add("橘子");
        Fruits.add("草莓");
        Fruits.add("芒果");

        for (int i = 0; i < Fruits.size(); i++) {
            System.out.println(Fruits.get(i));
        }

        String appleString = "橙子";
        System.out.println("水果中是否包含苹果：" + Fruits.contains(appleString));

        if (Fruits.contains(appleString)) {
            System.out.println("我喜欢");
        } else {
            System.out.println("我不高兴");
        }

        //list中根据索引将元素数值改变(替换)
        String a = "白龙马", b = "孙悟空", c = "猪八戒", d = "沙僧", e = "唐僧";
        List<String> people = new ArrayList<>();
        people.add(a);
        people.add(b);
        people.add(c);
        people.set(0, d);        //将d放到list中索引为0的位置，替换a
        people.add(1, e);        //将e放到list中索引为1的位置,原来位置的b后移一位


        for (String str : people) {
            System.out.println(str);
        }

        //list中查看（判断）元素的索引
        List<String> names = new ArrayList<>();
        names.add("刘备");
        names.add("关羽");
        names.add("张飞");
        names.add("刘备");
        names.add("张飞");
        System.out.println(names.indexOf("刘备"));
        System.out.println(names.lastIndexOf("刘备"));
        System.out.println(names.indexOf("张飞"));
        System.out.println(names.lastIndexOf("张飞"));

        if (names.indexOf("刘备") == 0) {
            System.out.println("刘备在这里");
        } else if (names.lastIndexOf("刘备") == 3) {
            System.out.println("刘备在哪里");
        } else {
            System.out.println("刘备到底在哪里？");
        }

        //利用list中索引位置重新生成一个新的list（截取集合）
        List phone = new ArrayList<>();
        List phone1 = new ArrayList<>();
        phone.add("苹果");
        phone.add("三星");
        phone.add(phone1);
        phone.add("小米");
        phone.add("锤子");

        for (Object pho : phone) {
            System.out.println(pho);
        }

        phone = phone.subList(1, 4);     //.subList(fromIndex, toIndex)  //利用索引1-4的对象重新生成一个list，但是不包含索引为4的元素，4-1=3
        for (int i = 0; i < phone.size(); i++) {
            System.out.println("新的list包含：" + phone.get(i));
        }

        //对比两个list中的所有元素
        //两个相等对象的equals方法一定为true, 但两个hashcode相等的对象不一定是相等的对象
        if (person.equals(Fruits)) {
            System.out.println("两个List中的元素是一样的");
        } else {
            System.out.println("两个List中的元素是不一样的");
        }

        if (person.hashCode() == Fruits.hashCode()) {
            System.out.println("我们相同");
        } else {
            System.out.println("我们不一样");
        }

        //判断list是否为空
        //空则返回true，非空则返回false
        if (person.isEmpty()) {
            System.out.println("空");
        } else {
            System.out.println("不是空");
        }

//        返回Iterator集合对象
        System.out.println("返回iterator集合对象" + person.iterator().next());

        //将集合转换为字符串
        String listring = "";
        listring = person.toString();
        System.out.println("将集合转换为字符串" + listring);

        String[] targetArr=new String[person.size()];
        //将集合转换为数组，默认类型
        System.out.println("将集合转换为数组" + person.toArray().length);

        person.toArray(targetArr);
        for(String s:targetArr){
            System.out.println(s);
        }

        ////将集合转换为指定类型（友好的处理）
        //1.默认类型
        List<Object> listString = new ArrayList<>();
        for (int i = 0; i < person.size(); i++) {
            listString.add(person.get(i));
            System.out.println(listString);
        }
        //2.指定类型
        List<StringBuffer> list1String = new ArrayList<>();
        for (String string:person){
            list1String.add(StringBuffer(string));
        }
    }

    private static StringBuffer StringBuffer(String string) {
        return null;
    }
//
//        List<String> list3 = new ArrayList<>();
//        list3.add("aa");
//        list3.add("ss");
//        list3.add("dd");
//        list3.add("aa");
//        list3.add("ss");

//        for (int i=0;i<list3.size()-1;i++){
//            for (int j=list3.size()-1;j>i;j--){
//                if (list3.get(i).equals(list3.get(j))){
//                    list3.remove(j);
//                }
//            }
//        }
//        System.out.println(list3);

//        List list4 = new ArrayList();
//        for (String s:)
//    }

}
