package com.example.arrays;

import java.util.*;

public class threeSum {
    private static void twoSum (int i, int[] nums,List<List<Integer>> res){
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int j=i+1; j<nums.length;j++){
            int diff=(nums[i]+nums[j])*-1;
            if (map.containsKey(diff)){
                List <Integer> l1 = new ArrayList<>();
                l1.add(nums[i]);
                l1.add(nums[j]);
                l1.add(diff);
                Collections.sort(l1);
                if (!res.contains(l1)){
                    res.add(l1);
                }
            }
            map.put(nums[j],j);
        }
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        List<List <Integer>> res= new ArrayList<>();
        for (int i=0; i< nums.length; i++){
            twoSum(i,nums,res);
        }

        return res;
    }

    public static void main (String args[]){
        int [] A ={-1,0,1,2,-1,-4};
        System.out.println(threeSum(A));
    }
}
