package com.example.arrays;

public class MaxSubArray {

    private static int maxSubArray(int [] A ){
        int maxSum=A[0];
        int sum=0;
        for (int i=0; i<A.length;i++){
            sum+=A[i];
            sum=Math.max(sum,0);
            maxSum=Math.max(sum,maxSum);
        }

        return maxSum;

    }

    public static void main (String args[]){
        int [] A = {-2,3,4,-8,5,-5,6,12};
        System.out.println(maxSubArray(A));

    }
}
