package com.example.strings;

import java.util.Arrays;

public class anagram {

    private static char [] convert_sort(String s){
        char [] char_array= new char[s.length()];
        int i=0;
        while (i<s.length()){
            char_array[i]=s.charAt(i);
            i+=1;
        }
        Arrays.sort(char_array);
        return char_array;

    }

    private static boolean compare(char []s1, char [] s2){
        if (s1.length!=s2.length){
            return false;
        }
        else {
            for (int i=0;i<s1.length;i++){
                if(s1[i]!=s2[i]){
                    return  false;
                }
            }
            return true;
        }

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
