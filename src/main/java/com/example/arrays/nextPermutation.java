package com.example.arrays;

import java.util.Arrays;

public class nextPermutation {

    private static void swap(int A[], int i, int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }

    private static void nextPermutation(int[] A) {
        int index=-1;

        for (int i=A.length-2;i>=0;i--){
            if (A[i]<A[i+1]) {
                index = i;
                break;
            }
        }

        if ( index!=-1){
            for (int i=A.length-1;i>=index;i--){
                if (A[i]>A[index]){
                    swap(A,i,index);
                    break;
                }
            }
        }

        int left=index+1;
        int right=A.length-1;


        while (left<=right){
            swap(A,left,right);
            left+=1;
            right-=1;

        }

    }

    public static void main (String [] args){
        int [] A = {1,2,3};
        nextPermutation(A);
        System.out.println(Arrays.toString(A));

    }
}
