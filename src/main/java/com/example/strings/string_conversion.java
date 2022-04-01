package com.example.strings;


import java.util.Arrays;

public class string_conversion {

    private static char [] convert(String s){
        char [] s_ch=new char [s.length()];
        for ( int i=0; i<s.length();i++){
            s_ch[i]=s.charAt(i);
        }
        return s_ch;

    }

    public static void main(String [] args){
        String s="hello";
        System.out.println(s);
        System.out.println(Arrays.toString(convert(s)));

    }
}
