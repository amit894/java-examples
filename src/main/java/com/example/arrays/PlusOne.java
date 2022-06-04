package com.example.arrays;

import java.util.Arrays;

public class PlusOne {

    private static int [] plus_one(int [] digits){
        int carry =1;
        for ( int i=digits.length-1; i>=0;i--){
            int digit_sum=carry+digits[i];
            digits[i]=digit_sum%10;
            carry=digit_sum/10;
            if (carry==0)
                break;
        }
        System.out.println(carry);
        if (carry==1){
            digits= new int[digits.length+1];
            digits[0]=1;
        }
        return  digits;

    }

    public static void main ( String args []){
        int [] nums = {9};
        System.out.println(Arrays.toString(plus_one(nums)));
    }
}
