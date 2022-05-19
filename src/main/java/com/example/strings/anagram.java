package com.example.strings;

import java.util.Arrays;

public class anagram {

    private static String convert_sort(String s){
        char [] char_array=new char[s.length()];
        char_array=s.toCharArray();
        Arrays.sort(char_array);
        String sorted_string=new String(char_array);
        return sorted_string;
    }

    private static boolean  compare (String s1, String s2){
        if (convert_sort(s1).equals(convert_sort(s2)))
            return true;
        return false;

    }

    public static void main(String [] args){
        String s1="bachelor";
        String s2="bacehlomr";
        String s3="backehlor";

        System.out.println(compare(s1,s2));
        System.out.println(compare(s2,s3));

    }
}
