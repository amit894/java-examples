package com.example.arrays;

import java.util.Arrays;

public class PlusOne {

    private static int [] plus_one(int [] digits){
        int carry=1;
        int right=digits.length-1;

        while (carry!=0 && right>=0){
            int digit_sum=digits[right]+carry;
            digits[right]=digit_sum%10;
            carry=digit_sum/10;
            System.out.println(carry);
            right-=1;

        }

        if (carry==1) {
            digits = new int[digits.length + 1];
            digits[0]=1;
        }


        return digits;


    }

    public static void main ( String args []){
        int [] nums = {9};
        System.out.println(Arrays.toString(plus_one(nums)));
    }
}
