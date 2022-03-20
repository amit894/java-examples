package com.example.strings;

import java.util.Arrays;

public class anagram {

    private static char [] convert_sort(String s){
        char [] char_array= new char[s.length()];

        for ( int i=0;i<s.length(); i++){
            char_array[i]=s.charAt(i);
        }

        Arrays.sort(char_array);
        return char_array;
    }

    private static boolean  compare (char [] char_array_1, char [] char_array_2){
        if (char_array_1.length != char_array_2.length){
            return false;
        }

        for ( int i=0; i<char_array_1.length;i++){
            if (char_array_1[i] != char_array_2[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String [] args){
        String s1="bachelor";
        String s2="bacehlor";
        char [] s1_array=convert_sort(s1);
        char [] s2_array=convert_sort(s2);
        System.out.println(s1_array);
        System.out.println(s2_array);
        System.out.println(compare(s1_array,s2_array));

    }
}
