package com.gla;

import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<Object> list=new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("orange");
        list.add("Papaya");
        list.add("Banana");
        list.set(0,"kivi");
        System.out.println("list of fruits="+list);

        String index0= list.get(0).toString();
        System.out.println("At index="+index0);

        list.remove("kivi");
        System.out.println("kivi Removed"+list);


        boolean kivi=list.contains("kivi");
        System.out.println("kivi is present or not="+kivi);


        boolean isEmpty=list.isEmpty();
        System.out.println("kivi is empty or not="+isEmpty);


        int size=list.size();
        System.out.println("size of the list="+size);







    }
}
