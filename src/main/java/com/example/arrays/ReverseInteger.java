package com.example.arrays;

public class ReverseInteger {

    private static int reverse_int(int num){
       String str=String.valueOf(Math.abs(num));
       char [] reverse_char_array= new char[str.length()];
       for (int i=0;i<str.length();i++){
           reverse_char_array[i]=str.charAt(str.length()-1-i);
       }
       String reverse_string= new String(reverse_char_array);

       if (num<0){
           return -1*Integer.valueOf(reverse_string);
       }
       return Integer.valueOf(reverse_string);

    }

    public static void main (String args []){
        int a =-1230;
        System.out.println(reverse_int(a));
    }
}
