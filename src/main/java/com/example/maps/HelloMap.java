package com.example.maps;
import java.util.*;

public class HelloMap {

    private static void string_string_map(){
        HashMap<String,String> s1 = new HashMap<>();
        s1.put("Amit","basketball");
        s1.put("Neha","Football");
        s1.put("Manoj","baseball");

        for (Map.Entry<String,String> entry:s1.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }

    private static void integer_integer_map(){
        HashMap <Integer, Integer> s1 = new HashMap<>();
        s1.put(1,100);
        s1.put(2,200);
        s1.put(3,300);

        for (Map.Entry<Integer,Integer> entry: s1.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());

        }


    }

    private static void string_integer_map(){

        HashMap<String, Integer> s1 = new HashMap<>();
        s1.put("Amit1",100);
        s1.put("Amit2",1000);
        s1.put("Amit3",10000);


        for (Map.Entry<String,Integer> entry: s1.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }

    private static void integer_string_map(){
        HashMap<Integer, String> s1 = new HashMap<>();
        s1.put(100,"Amit");
        s1.put(1000,"Manoj");
        s1.put(10000,"Amit3");


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

