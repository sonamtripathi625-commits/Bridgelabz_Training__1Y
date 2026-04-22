package com.gla;

import java.util.LinkedList;

public class Practice2 {
    public static void main(String[] args) {
        LinkedList<Object> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("list of number"+list);


        list.addFirst(1);
        System.out.println("add first index"+list);

        list.addLast(70);
        System.out.println("add last index"+list);

    //h    System.out.println("reversed the index"+list.reversed());

        list.removeFirst();
        System.out.println("remove first index"+list);


        list.removeLast();
        System.out.println("remove last index"+list);

        System.out.println(list.reversed());


    }
}
