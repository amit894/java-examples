package com.example.arrays;

import java.util.Arrays;

public class InsertionSort {


  private static void insertion_sort(int [] A){
      for ( int i=1; i<A.length;i++){
          int key=A[i];
          int j =i-1;
          while (j>=0 && A[j]>=key){
              A[j+1]=A[j];
              j-=1;
          }
          A[j+1]=key;
      }
  }

    public static void main(String [] args){
        int [] A={897,111,28,1,-98,-107,0};
        insertion_sort(A);
        System.out.println(Arrays.toString(A));
    }
}

//Time Complexity: O(n^2)
// Auxiliary Space: O(1)
// Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.
