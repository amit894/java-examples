package com.example.maps;
import java.util.*;

public class HelloMap {

    private static void string_string_map(){
        HashMap<String,String> map = new HashMap<>();
        map.put("Amit", "Chess");
        map.put("Neha","Basketball");

        for (Map.Entry<String,String> ele: map.entrySet()){
            System.out.println(ele.getKey()+":"+ele.getValue());
        }

        System.out.println(map);


    }

    private static void integer_integer_map(){
       HashMap<Integer,Integer>  map = new HashMap<>();
       map.put(1,1);
       map.put(2,2);
       map.put(3,3);

       for (Map.Entry<Integer,Integer> ele : map.entrySet()){
           System.out.println(ele.getKey()+" "+ele.getValue());
       }

        System.out.println(map);


    }

    private static void string_integer_map(){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("0",100);
        map.put("1",101);

        for (Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


    }

    private static void integer_string_map(){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(100,"0");
        map.put(101,"1");

        for (Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }




    }

    public static void main(String args[])
    {
          string_string_map();
          integer_integer_map();
          string_integer_map();
          integer_string_map();

    }
}

