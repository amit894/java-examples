package com.example.strings;

import java.util.Arrays;

public class anagram {

    private static char [] convert_sort(String s){
        char [] ch_arr= new char [s.length()];
        ch_arr=s.toCharArray();
        Arrays.sort(ch_arr);
        return ch_arr;
    }

    private static boolean  compare (char [] char_array_1, char [] char_array_2){
        String s1= new String(char_array_1);
        String s2 = new String(char_array_2);

        if (s1.equals(s2)){
            return true;
        }

        return false;
    }

    public static void main(String [] args){
        String s1="bachelor";
        String s2="bacehlor";
        String s3="backehlor";

        char [] s1_array=convert_sort(s1);
        char [] s2_array=convert_sort(s2);
        char [] s3_array=convert_sort(s3);
        System.out.println(compare(s1_array,s2_array));
        System.out.println(compare(s1_array,s3_array));

    }
}
