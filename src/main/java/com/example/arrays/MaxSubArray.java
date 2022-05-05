package com.example.arrays;

public class MaxSubArray {

    private static int maxSubArray(int [] A ){
       int maxSum=A[0];
       int windowSum=0;

       for (int i=0;i<A.length;i++){
           windowSum+=A[i];
           maxSum=Math.max(windowSum,maxSum);
           windowSum=Math.max(windowSum,0);
       }

       return maxSum;
    }

    public static void main (String args[]){
        int [] A = {-2,3,-4,-3,6,3,8,12};
        System.out.println(maxSubArray(A));

    }
}
