package com.example.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {

    private static int [] twoSum(int [] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int diff=target-nums[i];

            if (map.containsKey(diff)){
                int [] result = new int [2];
                result[0]=map.get(diff);
                result[1]=i;
                return result;
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main (String args[]){
        int [] nums = {3,0,6,11,15};
        int [] result=twoSum(nums,6);
        System.out.println(Arrays.toString(result));
    }
}
