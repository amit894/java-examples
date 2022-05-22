package com.example.arrayList;

import java.util.*;

public class HelloArrayList {

    private static void integer_list_initalize(){
        List <Integer> list = new ArrayList<>();
        list.add(100);
        list.add(1000);

        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

    }

    private static void string_list_initalize(){
        List <String> list = new ArrayList<>();
        list.add("100");
        list.add("1000");

        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }



    }

    private static void iterator_int_array_list(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);

        System.out.println(list);


        for (int ele:list) {
            System.out.println(ele);
        }
    }

    private static void nested_list_initalize(){
        List <List <String>> list = new ArrayList<>();
        for (int i=0; i<5;i++){
            List <String> temp_list = new ArrayList<>();
            temp_list.add("Amit");
            temp_list.add("Neha");
            list.add(temp_list);
        }

        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static void main (String [] args){
        integer_list_initalize();
        string_list_initalize();
        nested_list_initalize();
        iterator_int_array_list();
    }
}
