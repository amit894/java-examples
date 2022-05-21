package com.example.arrays;

import java.util.*;

public class threeSum {
    private static void twoSum (int i, int[] nums,List<List<Integer>> result){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int j=i+1;j<nums.length;j++){
            int diff= (nums[i]*-1)-nums[j];
            if (map.containsKey(diff)){
                List <Integer> temp_list=new ArrayList<>();
                temp_list.add(nums[i]);
                temp_list.add(nums[j]);
                temp_list.add(diff);
                Collections.sort(temp_list);
                if (!result.contains(temp_list))
                    result.add(temp_list);
            }
            map.put(nums[j],j);
        }

    }

    private static List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
       for ( int i=0; i<nums.length;i++){
           twoSum(i,nums,result);
       }

       return result;
    }

    public static void main (String args[]){
        int [] A ={-1,0,1,2,-1,-4};
        System.out.println(threeSum(A));
    }
}
