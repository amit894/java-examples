package com.example.arrays;


import java.util.Arrays;

public class LeftRotate {

    private static void  left_rotate_by_one(int A[], int n){
        int temp = A[0];
        for (int i=0;i<n-1;i++){
            A[i]=A[i+1];
        }
        A[n-1]=temp;

    }

    private static void left_rotate (int A[],int d, int n){
        for ( int i=0;i<d;i++){
            left_rotate_by_one(A,n);

        }
    }
    public static void main (String args[]){
        int A []={1,2,3,4,5};
        left_rotate(A,1,5);
        System.out.println(Arrays.toString(A));

    }
}
