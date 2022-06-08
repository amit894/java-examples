package com.example.hashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HelloHashSet {

    private static void integer_set (){
      HashSet <Integer> set = new HashSet<>();
      set.add(1);
      set.add(2);
      set.add(3);
      for (Integer key:set){
          System.out.println(key);
      }
    }

    private static void string_set (){
        HashSet<String> set = new HashSet<>();
        set.add("Amit");
        set.add("Neha");

        for ( String ele:set){
            System.out.println(ele);
        }
    }


    public static void main ( String [] args){
        string_set();
        integer_set();
    }
}
