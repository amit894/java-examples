package com.example.arrays;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse_array(int []A){
       int left=0;
       int right=A.length-1;
       while (left<=right){
           int temp=A[left];
           A[left]=A[right];
           A[right]=temp;
           left+=1;
           right-=1;
       }

    }

    public static void main (String args []){
        int [] A = {1,2,3,4,5,6};
        reverse_array(A);
        System.out.println(Arrays.toString(A));

    }
}
