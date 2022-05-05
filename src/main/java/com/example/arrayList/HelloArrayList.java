package com.example.arrayList;

import java.util.*;

public class HelloArrayList {

    private static void integer_list_initalize(){
        List <Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);

        System.out.println(list);
    }

    private static void string_list_initalize(){
        List <String> list= new ArrayList<>();
        list.add(String.valueOf(1));
        list.add(String.valueOf(2));
        list.add(String.valueOf(3));

        System.out.println(list);


    }

    private static void nested_list_initalize(){
        List<List <String>> l1 = new ArrayList<>();
        for (int i=0; i<5;i++){
            List <String> s1 = new ArrayList<>();
            s1.add("A");
            s1.add("B");
            l1.add(s1);
        }
        System.out.println(l1);
    }

    public static void main (String [] args){
        integer_list_initalize();
        string_list_initalize();
        nested_list_initalize();
    }
}
