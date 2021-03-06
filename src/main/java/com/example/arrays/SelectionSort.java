package com.example.arrays;

import java.util.Arrays;

public class SelectionSort {

  private static void selection_sort(int [] A){
      for ( int i=0; i<A.length;i++){
          int min_idx=i;
          for (int j=i; j<A.length;j++){
              if (A[j]<A[min_idx])
                  min_idx=j;
          }

          int temp = A[min_idx];
          A[min_idx]= A[i];
          A[i]=temp;
      }
  }


    public static void main(String args[]){
        int [] A={2345,234, -123, -1, -678,0};
        selection_sort(A);
        System.out.println(Arrays.toString(A));
    }
}

//Time Complexity : O(n^2)
//Auxililary Space Complexity: O(1)
