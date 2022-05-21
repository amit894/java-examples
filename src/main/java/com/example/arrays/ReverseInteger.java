package com.example.arrays;

public class ReverseInteger {

    private static int reverse_int(int x){
        int result=0;
        int sign=1;
        if (x<0)
            sign=-1;
        x=Math.abs(x);

        while (x>0){
            int digit=x%10;
            result=result*10+digit;
            x=x/10;
        }

        return (sign*result);

    }

    public static void main (String args []){
        int a =11230;
        int b =-11230;
        System.out.println(reverse_int(a));
        System.out.println(reverse_int(b));

    }
}
