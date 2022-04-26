package com.example.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {

    private static int [] twoSum(int [] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<nums.length;i++){
            int diff = target-nums[i];
            if (map.containsKey(diff)){
                return (new int [] {map.get(diff),i});
            }
            map.put(nums[i],i);
        }

        return null;
    }

    public static void main (String args[]){
        int [] nums = {2,7,11,15};
        int [] result=twoSum(nums,9);
        System.out.println(Arrays.toString(result));
    }
}
