package com.example.arrays;

import java.util.Arrays;

public class QuickSort {

    private static int pivot(int low, int high, int [] A){
        int i=low-1;
        int pivot=A[high];
        for (int j=low;j<high;j++){
            if (A[j]<pivot){
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                i+=1;
            }
        }
        int temp=A[i+1];
        A[i+1]=A[high];
        A[high]=temp;
        return (i+1);
    }

    private static int [] quick_sort(int low, int high, int [] A){
       if (A.length==1){
           return A;
       }
       else if (low<=high) {
           int pi=pivot(low,high,A);
           quick_sort(low,pi-1,A);
           quick_sort(pi+1,high,A);
           
       }
        return A;
    }

    public static void main (String args[]){
        int [] A ={56, 0, 21, 32, -43};
        quick_sort(0,A.length-1, A);
        System.out.println(Arrays.toString(A));
    }
}
