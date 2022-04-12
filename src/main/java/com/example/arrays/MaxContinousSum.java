package com.example.arrays;

public class MaxContinousSum {

    private static int maxContinousSum( int [] A, int k){
        int maxSum=0;

        for (int i=0; i<k;i++){
            maxSum+=A[i];
        }
        int window_sum=maxSum;

        for (int i=k;i<A.length;i++){
            window_sum=window_sum+A[i]-A[i-k];
            maxSum=Math.max(window_sum,maxSum);
        }

        return maxSum;
    }

    public static void main (String args []){
        int [] A = {-2,3,4,-8,1,-5,6,12};
        System.out.println(maxContinousSum(A,4));

    }
}
