package com.example.arrays;
import java.util.Arrays;

public class MergeSort {

    private static void merge_sort(int [] A) {
      if (A.length>1){
          int mid = A.length/2;
          int [] L= Arrays.copyOfRange(A,0,mid);
          int [] R= Arrays.copyOfRange(A,mid,A.length);

          merge_sort(L);
          merge_sort(R);

          int i,j,k;
          i=j=k=0;
          while (i<L.length && j<R.length && k<A.length){
              if (L[i]<R[j]){
                  A[k]=L[i];
                  k+=1;
                  i+=1;
              }
              else {
                  A[k]=R[j];
                  k+=1;
                  j+=1;
              }
          }

          while (i<L.length){
              A[k]=L[i];
              k+=1;
              i+=1;
          }
          while(j<R.length) {
              A[k]=R[j];
              k+=1;
              j+=1;
          }


      }

    }

    public static void main (String [] args){
        System.out.println();
        int [] A ={56, 21, 21, 32, 43};
        merge_sort(A);
        System.out.println(Arrays.toString(A));

    }
}


//Time Complexity: Sorting Aays on different machines. Merge Sort is a recursive algorithm and time complexity can be expressed as following recurrence relation.
//T(n) = 2T(n/2) + θ(n)
//O(n*log n)
// The above recurrence can be solved either using the Recurrence Tree method or the Master method. It falls in case II of Master Method and the solution of the recurrence is θ(nLogn). Time complexity of Merge Sort is  θ(nLogn) in all 3 cases (worst, average and best) as merge sort always divides the Aay into two halves and takes linear time to merge two halves.
// Auxiliary Space: O(n)
// Algorithmic Paradigm: Divide and Conquer
// Sorting In Place: No in a typical implementation
// Stable: Yes
