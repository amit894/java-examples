package com.example.arrays;

import java.util.Arrays;

public class nextPermutation {

    private static void nextPermutation(int[] A) {
        int left=A.length-1;
        while (left>0){
            if (A[left-1]<A[left]){
                break;
            }
            left-=1;
        }
        int key_idx=left-1;
        int i=left;
        while (i<A.length){
            if (A[i]>A[key_idx]){
                int temp=A[i];
                A[i]=A[key_idx];
                A[key_idx]=temp;
                break;
            }
            i+=1;
        }
        int right=A.length-1;
        while(left<=right){
            int temp=A[left];
            A[left]=A[right];
            A[right]=temp;
            left+=1;
            right-=1;
        }

    }

    public static void main (String [] args){
        System.out.println("Hello");
        int [] A = {1,1,5};
        nextPermutation(A);
        System.out.println(Arrays.toString(A));

    }
}
