package com.example.arrays;

import java.util.*;

public class threeSum {
    private static void twoSum (int i, List<List<Integer>> res,int[] nums){
        HashMap<Integer,Integer> map = new HashMap <>();
        for (int j=i+1;j<nums.length;j++){
            int diff = (nums[i]*-1)-nums[j];
            if (map.containsKey(diff)){
                if (i!=j && j!=map.get(diff) && i!=map.get(diff)){
                    int [] k= new int[] {nums[i],diff,nums[j]};
                    res.add(Arrays.asList(k[0],k[1],k[2]));
                }
            }
            map.put(nums[j],j);
        }
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0; i<nums.length; i++){
            twoSum(i,res,nums);
        }
        return res;

    }

    public static void main (String args[]){
        int [] A ={-1,0,1,2,-1,-4};
        System.out.println(threeSum(A));
    }
}
