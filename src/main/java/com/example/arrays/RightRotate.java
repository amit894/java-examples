package com.example.arrays;

import java.util.Arrays;

public class RightRotate {

    private static void right_rotate_by_one(int A[], int n){
        int temp=A[n-1];
        for( int i=n-1; i>0; i--){
            A[i]=A[i-1];
        }
        A[0]=temp;

    }

    private static void right_rotate(int A[], int n, int d){
        for( int i=0; i<d; i++){
            right_rotate_by_one(A,n);
        }
    }

    public static void main (String args[]){
        int A[]={1,2,3,4,5};
        System.out.println("Hello World");
        right_rotate(A,5,1);
        System.out.println(Arrays.toString(A));
    }
}

//Time Complexity : O(d*n)
//Auxililary Space Complexity: O(1)