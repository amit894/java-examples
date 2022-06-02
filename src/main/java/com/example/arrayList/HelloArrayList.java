package com.example.arrayList;

import java.util.*;

public class HelloArrayList {

    private static void integer_list_initalize(){
       List <Integer> list = new ArrayList<>();
       for (int i=0; i<5;i++){
           list.add(i);
       }
       System.out.println(list);

        for (int i=0; i<5;i++){
            System.out.println(list.get(i));
        }

    }

    private static void string_list_initalize(){
        List <String> list = new ArrayList<>();
        for (int i=0; i<5;i++){
            list.add(String.valueOf(i));
        }
        System.out.println(list);

        for (int i=0; i<5;i++){
            System.out.println(list.get(i));
        }


    }

    private static void iterator_int_array_list(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);

        System.out.println(list);


        for ( int ele:list){
            System.out.println(ele);
        }
    }


    private static void iterator_str_array_list(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Amit");
        list.add("Neha");
        list.add("Manoj");

        System.out.println(list);


        for ( String ele:list){
            System.out.println(ele);
        }
    }



    private static void nested_list_initalize(){
        List<List <String>> list = new ArrayList<>();

        for (int i=0; i<5;i++){
            List <String> temp_list = new ArrayList<>();
            temp_list.add("Amit"+String.valueOf(i));
            temp_list.add("Neha"+String.valueOf(i));
            temp_list.add("Manoj"+String.valueOf(i));
            list.add(temp_list);
        }

        System.out.println(list);

        for (int i=0; i<5;i++){
            System.out.println(list.get(i));
        }


    }

    public static void main (String [] args){
        integer_list_initalize();
        string_list_initalize();
        iterator_int_array_list();
        iterator_str_array_list();
        nested_list_initalize();
    }
}
