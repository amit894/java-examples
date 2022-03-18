package com.example.strings;


public class string_conversion {

    private static char [] convert(String s){
        char [] char_array= new char[s.length()];
        int i=0;
        while (i<s.length()){
            char_array[i]=s.charAt(i);
            i+=1;
        }
        return char_array;

    }

    public static void main(String [] args){
        String s="hello";
        System.out.println(convert(s));



    }
}
