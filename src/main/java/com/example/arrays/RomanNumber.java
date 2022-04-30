package com.example.arrays;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class RomanNumber {

    private static int roman_numbers(String s){
       int result=0;
       HashMap<Character,Integer> map= new HashMap<>();
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);

       for (int i=0;i<s.length()-1;i++){
           if (map.get(s.charAt(i))>=map.get(s.charAt(i+1))){
               result=result+map.get(s.charAt(i));
           }
           else {
               result=result-map.get(s.charAt(i));
           }
       }
        result+=map.get(s.charAt(s.length()-1));
        return result;
    }

    public static void main (String args[]){
        System.out.println(roman_numbers("MCMXCIV"));
    }
}
