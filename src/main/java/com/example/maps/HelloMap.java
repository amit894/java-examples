package com.example.maps;
import java.util.*;

public class HelloMap {

    private static void string_string_map(){
        HashMap<String,String> list = new HashMap<>();
        list.put("Amit", "Football");
        list.put("Sumit", "Basketball");

        for (Map.Entry<String,String> entry: list.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }

    private static void integer_integer_map(){
        HashMap <Integer, Integer> s1 = new HashMap<>();
        s1.put(1,3);
        s1.put(4,5);

        for (Map.Entry<Integer,Integer> entry: s1.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }

    private static void string_integer_map(){
        HashMap<String,Integer> s1 = new HashMap<>();
        s1.put("Amit",1);
        s1.put("Manoj",2);

        System.out.println(s1);


        for (Map.Entry<String,Integer> entry: s1.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }



    }

    private static void integer_string_map(){
        HashMap<Integer,String> s1 = new HashMap<>();
        s1.put(1,"Manoj");
        s1.put(2,"Sunita");

        System.out.println(s1);

        for (Map.Entry<Integer,String> entry: s1.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
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

