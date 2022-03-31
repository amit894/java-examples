package com.example.arrays;

import java.util.Arrays;

public class RightRotate {

    private static void right_rotate(int [] A, int d){
        for ( int i=0; i<d;i++){
            right_rotate_by_one(A);
        }
    }

    private static void right_rotate_by_one(int [] A) {
        int temp= A[A.length-1];
        for (int i=A.length-1; i>0;i--){
            A[i]=A[i-1];
        }
        A[0]=temp;

    }
    public static void main (String args[]){
        int A[]={1,2,3,4,5};
        right_rotate(A,1);
        System.out.println(Arrays.toString(A));
    }
}

//Time Complexity : O(d*n)
//Auxililary Space Complexity: O(1)