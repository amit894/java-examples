package com.example.arrays;

public class ReverseInteger {

    private static int reverse_int(int x){
        int sign=0;
        int result=0;

        if (x<0)
            sign=-1;
        else
            sign=1;

        x=Math.abs(x);

        while (x>0){
            if (sign*result<=Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            else if (sign*result>=Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            int digit=x%10;
            result=result*10+digit;
            x=x/10;
        }


        return sign*result;

    }

    public static void main (String args []){
        int a =11230;
        System.out.println(reverse_int(a));
    }
}
