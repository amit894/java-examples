package com.example.strings;


import java.util.Arrays;

public class string_conversion {

    private static char [] convert(String s){
      char [] char_array= new char [s.length()];
      for (int i=0;i<s.length();i++){
          char_array[i]=s.charAt(i);
      }
      return char_array;
    }

    public static void main(String [] args){
        String s="hello";
        System.out.println(s);
        System.out.println(Arrays.toString(convert(s)));

    }
}
