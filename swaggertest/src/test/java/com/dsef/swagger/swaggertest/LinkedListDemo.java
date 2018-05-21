package com.dsef.swagger.swaggertest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * created by DSEF on 2018/5/18.
 *
 * 常用的用法
 * boolean add(Object o)添加对象到集合
 * boolean remove(Object o)删除指定的对象
 * int size()返回当前集合中元素的数量
 *boolean contains(Object o)查找集合中是否有指定的对象
 * boolean isEmpty()判断集合是否为空
 * Iterator iterator()返回一个迭代器
 * boolean containsAll(Collection c)查找集合中是否有集合c中的元素
 * boolean addAll(Collection c)将集合c中所有的元素添加给该集合
 * void clear()删除集合中所有元素
 * void removeAll(Collection c)从集合中删除c集合中也有的元素
 * void retainAll(Collection c)从集合中删除集合c中不包含的元素
 * 遍历
 **/
public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> linkeddemo = new LinkedList<>();
        LinkedList<String> c = new LinkedList<>();

        linkeddemo.add("first");    //添加元素
        linkeddemo.add("second");
        linkeddemo.add("third");
        linkeddemo.add("four");
        linkeddemo.add("five");
//        linkeddemo.add("third");
        System.out.println(linkeddemo);

        c.add("second");
        c.add("four");
        c.add("six");
        System.out.println(c);

//        linkeddemo.addFirst("test1");   //在链表头部插入一个元素
//        System.out.println(linkeddemo);
//
//        linkeddemo.addLast("test2");    //在链表尾部插入元素
//        System.out.println(linkeddemo);
//
//        linkeddemo.add(2,"addByIndex");     //在指定位置插入元素
//        System.out.println(linkeddemo);

//        linkeddemo.remove();    //移除链表第一个元素
//        System.out.println(linkeddemo);

//        linkeddemo.remove("second");    //移除链表中的指定元素
//        System.out.println(linkeddemo);

//        linkeddemo.remove(3);   //移除链表中指定位置的元素
//        System.out.println(linkeddemo);

//        linkeddemo.removeFirst();   //  移除第一个元素
//        linkeddemo.removeLast();    //移除最后一个元素
//        System.out.println(linkeddemo);

//        linkeddemo.removeFirstOccurrence("third");  //移除链表中第一次出现所在位置的元素
//        System.out.println(linkeddemo);

//        linkeddemo.removeLastOccurrence("third");   //移除链表中最后一次出现所在位置的元素
//        System.out.println(linkeddemo);

//        System.out.println(linkeddemo.size());    //返回当前集合中元素的数量

//        System.out.println(linkeddemo.contains("second"));  //查找集合中是否有指定的对象
//
//        System.out.println(linkeddemo.isEmpty());   //判断集合是否为空
//        linkeddemo.clear();                         //删除集合中所有元素
//        System.out.println(linkeddemo.isEmpty());

//        Iterator it =  linkeddemo.iterator();
//        System.out.println(it.next());

//        System.out.println(linkeddemo.containsAll(c));  //查找集合中是否有集合c中的元素
//        linkeddemo.addAll(c);
//        System.out.println(linkeddemo);     //将集合c中所有的元素添加给该集合
//        linkeddemo.removeAll(c);      //从集合中删除c集合中也有的元素
//        System.out.println(linkeddemo);

//        linkeddemo.retainAll(c);    //从集合中删除c集合中也有的元素集合c中不包含的元素
//        System.out.println(linkeddemo);

//        System.out.println(linkeddemo.get(2));
//        System.out.println(linkeddemo.getFirst());
//        System.out.println(linkeddemo.getLast());
//        System.out.println(linkeddemo.getClass());

//        linkeddemo.push("one"); //与addFirst一样，实际上它就是addFirst
//        System.out.println(linkeddemo);
//        linkeddemo.pop();
//        System.out.println(linkeddemo); //与removeFirst一样，实际上它就是removeFirst

//        System.out.println(linkeddemo.pop());

//        linkeddemo.poll();    //查询并移除第一个元素
//        System.out.println(linkeddemo);
//        System.out.println(linkeddemo.poll());
//        System.out.println(linkeddemo);

//        linkeddemo.peek();    //获取第一个元素，但是不移除；
//        System.out.println(linkeddemo.peek());
//        System.out.println(linkeddemo);
//        linkeddemo.peekFirst();   //获取第一个元素，但是不移除；
//        System.out.println(linkeddemo.peekFirst());
//        System.out.println(linkeddemo);
//        linkeddemo.peekLast();    //获取最后一个元素，但是不移除；
//        System.out.println(linkeddemo.peekLast());
//        System.out.println(linkeddemo);
//
//        linkeddemo.offer("six");
//        System.out.println(linkeddemo);

//        for (int i = 0; i <linkeddemo.size() ; i++) {
//            System.out.println(linkeddemo.get(i));
//        }

//        for (String i:linkeddemo) {
//            System.out.println(i);
//        }

        for (Iterator<String> iter = linkeddemo.iterator();iter.hasNext();){
            //iter.next();
            String li = (String)iter.next();
            System.out.println(li);
        }
    }
    
}
