package com.example.arrays;

import java.util.Arrays;

public class BinarySearch {

    private static int search (int low, int high, int [] A, int item){
        if (low<=high){
            int mid=(low+high)/2;

            if (A[mid]==item)
                return mid;
            else if (A[mid]<item)
                return search(mid+1,high, A, item);
            else
               return search(low,mid-1, A, item);

        }
        return  -1;

    }
    public static void main (String args []){
        int [] A={1,2,3,4,5};
        int index= search(0,A.length-1,A,5);
        System.out.println(index);
    }
}

// The time complexity of the binary search algorithm is O(log n)