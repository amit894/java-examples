package com.example.arrays;

public class ReverseInteger {

    private static int reverse_int(int num){
       String st= String.valueOf(Math.abs(num));
       String reverse_string = "";
       for ( int i=st.length()-1;i>=0;i--){
           reverse_string+=String.valueOf(st.charAt(i));
       }


       if (num<0){
           return Integer.valueOf(reverse_string)*-1;
       }

       return Integer.valueOf(reverse_string);

    }

    public static void main (String args []){
        int a =-12305;
        System.out.println(reverse_int(a));
    }
}
