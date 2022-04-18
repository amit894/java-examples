package com.example.arrays;

public class ReverseInteger {

    private static int reverse_int(int num){
        String str = String.valueOf(Math.abs(num));
        char [] reverse_str_array= new char[str.length()];

        for (int i=str.length()-1;i>=0;i--){
            reverse_str_array[str.length()-1-i]=str.charAt(i);
        }

        String reverse_str=new String(reverse_str_array);

        if (num>0){
            return Integer.valueOf(reverse_str);
        }
        else {
            return Integer.valueOf(reverse_str)*-1;

        }

    }

    public static void main (String args []){
        int a =-123;
        System.out.println(reverse_int(a));
    }
}
