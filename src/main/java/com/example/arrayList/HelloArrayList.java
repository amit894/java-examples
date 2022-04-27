package com.example.arrayList;

import java.util.*;

public class HelloArrayList {

    private static void list_initalize(){
        List <Integer> list = new ArrayList<>();
        for (int i=0; i<5;i++){
            list.add(i);
        }
    }

    private static void nested_list_initalize(){
        List<List <Integer>> l1 = new ArrayList<>(5);

        for (int i=0; i<5;i++){
            List<Integer> temp_array= new ArrayList<>();
            temp_array.add(i);
            temp_array.add(i);
            ///l1.add(Arrays.asList(temp_array[0], temp_array[1]));
            l1.add(temp_array);
        }

        System.out.println(l1);
    }

    public static void main (String [] args){
        list_initalize();
        nested_list_initalize();
    }
}
