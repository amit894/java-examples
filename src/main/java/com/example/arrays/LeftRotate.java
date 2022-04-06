package com.example.arrays;


import java.util.Arrays;

public class LeftRotate {

   private static void left_rotate(int [] A, int d){
       for ( int i=0; i<d;i++){
           left_rotate_by_one(A);
       }

   }

   private static void left_rotate_by_one(int [] A) {
       int temp = A[0];
       for ( int j=0;j<A.length-1;j++){
           A[j]=A[j+1];
       }
       A[A.length-1]=temp;


   }


    public static void main (String args[]){
        int [] A={1,2,3,4,5};
        left_rotate(A,1);
        System.out.println(Arrays.toString(A));

    }
}

//Time Complexity : O(d*n)
//Auxililary Space Complexity: O(1)

