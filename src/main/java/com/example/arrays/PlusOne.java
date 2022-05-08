package com.example.arrays;

import java.util.Arrays;

public class PlusOne {

    private static int [] plus_one(int [] digits){
        int carry=1;
        int i=digits.length-1;
        while (carry!=0 && i>=0){
            int digit_sum=carry+digits[i];
            digits[i]=(digit_sum)%10;
            carry=(digit_sum)/10;
            i-=1;
        }
        if (carry==1){
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;

        }
        return digits;

    }

    public static void main ( String args []){
        int [] nums = {0};
        System.out.println(Arrays.toString(plus_one(nums)));
    }
}
