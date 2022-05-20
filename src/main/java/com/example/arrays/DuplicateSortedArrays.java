package com.example.arrays;

import java.util.Arrays;

public class DuplicateSortedArrays {

    private static int removeDuplicates(int [] nums){
        int unique_index=0;
        int duplicate_index=0;

        while (unique_index<nums.length && duplicate_index<nums.length){
            if (nums[unique_index]==nums[duplicate_index])
                duplicate_index+=1;
            else {
                unique_index += 1;
                int temp=nums[unique_index];
                nums[unique_index]=nums[duplicate_index];
                nums[duplicate_index]=temp;
                duplicate_index+=1;

            }

        }
        System.out.println(Arrays.toString(nums));

        return (unique_index+1);
    }

    public static void main (String args[]){
        int [] A = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(A));
    }
}
