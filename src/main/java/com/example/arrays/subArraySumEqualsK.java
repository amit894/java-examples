package com.example.arrays;

import java.util.HashMap;

public class subArraySumEqualsK {

    private static int SumEqualK(int [] nums, int k){
        int count =0;
        for (int i=0; i<nums.length;i++){
            int sum=0;
            for (int j=i; j<nums.length;j++){
                sum+=nums[j];
                if (sum==k)
                    count+=1;
            }
        }

        return count;
    }

    private static int SumEqualK1(int [] nums, int k){
        int count =0;
        int sum=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        for (int i=0; i<nums.length;i++){
            sum+=nums[i];
            if (map.containsKey(sum-k))
                count+=map.get(sum-k);
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }
            else {
                map.put(sum,1);
            }
        }

        return count;

    }



    public static void main (String args []){
        int [] A = {1,1,1};
        int [] B = {1,2,3};

        System.out.println(SumEqualK1(A,2));
        System.out.println(SumEqualK1(B,3));

        System.out.println(SumEqualK(A,2));
        System.out.println(SumEqualK1(B,3));

    }

}
