package com.example.arrays;
import java.util.Arrays;

public class MergeSort {

    private static void merge_sort(int [] A){
        if (A.length>1){
            int mid = A.length/2;
            int [] left = Arrays.copyOfRange(A, 0, mid);
            int [] right = Arrays.copyOfRange(A,mid,A.length);
            merge_sort(left);
            merge_sort(right);
            int i=0;
            int j=0;
            int k=0;
            while (i<left.length && j<right.length && k<A.length){
                if (left[i]<=right[j]){
                    A[k]=left[i];
                    i+=1;
                    k+=1;
                }
                else {
                    A[k]=right[j];
                    j+=1;
                    k+=1;
                }

            }

            while (i<left.length){
                A[k]=left[i];
                i+=1;
                k+=1;
            }

            while (j<right.length){
                A[k]=right[j];
                j+=1;
                k+=1;
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
