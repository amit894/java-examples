package com.example.arrays;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class RomanNumber {

    private static int roman_numbers(String s){
        int result=0;
        HashMap<Character,Integer> roman_set= new HashMap<>();
        roman_set.put('I',1);
        roman_set.put('V',5);
        roman_set.put('X',10);
        roman_set.put('L',50);
        roman_set.put('C',100);
        roman_set.put('D',500);
        roman_set.put('M',1000);

        for (int i=0; i<s.length()-1;i++){
            if (roman_set.get(s.charAt(i))>=roman_set.get(s.charAt(i+1))){
                result+=roman_set.get(s.charAt(i));
            }
            else{
                result-=roman_set.get(s.charAt(i));
            }
        }
        result+=roman_set.get(s.charAt(s.length()-1));

        return result;
    }

    public static void main (String args[]){
        System.out.println(roman_numbers("MCMXCIV"));
    }
}
