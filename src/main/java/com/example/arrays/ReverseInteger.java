package com.example.arrays;

public class ReverseInteger {

    private static int reverse_int(int num){
       String str=String.valueOf(Math.abs(num));
       String reverse_string= new String();

       char [] reverse_char_array= new char[str.length()];
       for (int i=0;i<str.length();i++){
           reverse_string=reverse_string+String.valueOf(str.charAt(str.length()-1-i));
       }

       if (num<0){
           return -1*Integer.valueOf(reverse_string);
       }
       return Integer.valueOf(reverse_string);

    }

    public static void main (String args []){
        int a =-12305;
        System.out.println(reverse_int(a));
    }
}
