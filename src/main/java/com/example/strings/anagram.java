package com.example.strings;

import java.util.Arrays;

public class anagram {

    private static char [] convert_sort(String s){
     char [] s1= new char[s.length()];
     for (int i=0;i<s.length();i++){
         s1[i]=s.charAt(i);
     }
     Arrays.sort(s1);
     return s1;
    }

    private static boolean  compare (char [] char_array_1, char [] char_array_2){
        if (char_array_1.length !=char_array_2.length){
            return false;
        }
        for (int i=0; i<char_array_1.length;i++){
            if (char_array_1[i]!=char_array_2[i]){
                return false;
            }
        }
        return true;
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
