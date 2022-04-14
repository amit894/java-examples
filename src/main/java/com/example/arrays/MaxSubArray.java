package com.example.arrays;

public class MaxSubArray {

    private static int maxSubArray(int [] A ){
        int maxSum=A[0];
        int sum=0;

        for ( int i=0; i<A.length;i++){
            sum+=A[i];
            maxSum=Math.max(sum,maxSum);
            sum=Math.max(0,sum);
        }
        return maxSum;

    }

    public static void main (String args[]){
        int [] A = {-2,3,4,-8,6,-5,10,12};
        System.out.println(maxSubArray(A));

    }
}