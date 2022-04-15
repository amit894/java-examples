package com.example.maps;
import java.util.*;

public class HelloMap {

    private static void string_string_map(){
        HashMap<String, String> s1 = new HashMap<>();
        s1.put("Amit","Tennis");
        s1.put("Gaurav","Football");
        s1.put("Ayush", "Tennis");

        for ( Map.Entry<String,String> entry: s1.entrySet()){
            System.out.println("Key="+ entry.getKey()+" Value="+entry.getValue());
        }



    }

    private static void integer_integer_map(){
        HashMap <Integer, Integer> s1 = new HashMap<>();
        s1.put(1,1000);
        s1.put(2,2000);
        s1.put(3,3000);

        for (Map.Entry<Integer, Integer> entry: s1.entrySet()){
            System.out.println("Key="+ entry.getKey()+ " Value="+ entry.getValue());
        }

    }

    private static void string_integer_map(){
      HashMap<String, Integer> s1=new HashMap<>();
      s1.put("Amit", 100);
      s1.put("Neha",200);
      s1.put("Kansishka",100);

      for ( Map.Entry<String, Integer> entry: s1.entrySet()){
          System.out.println("Key="+entry.getKey()+" Value="+ entry.getValue());
      }

    }

    private static void integer_string_map(){
        HashMap <Integer,String> s1  = new HashMap<>();
        s1.put(1,"Amit");
        s1.put(2,"Neha");
        s1.put(3,"Mohan");

        for (Map.Entry<Integer, String> entry:s1.entrySet()){
            System.out.println("Key="+entry.getKey()+" Value="+entry.getValue());
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

