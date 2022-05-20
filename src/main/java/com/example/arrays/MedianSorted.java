package com.example.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MedianSorted {

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;

        int [] merged= new int[m+n];

        int i=0;
        int j=0;
        int k=0;

        while (i<nums1.length && j<nums2.length && k<merged.length){
            if (nums1[i]<nums2[j]) {
                merged[k] = nums1[i];
                k+=1;
                i+=1;
            }
            else {
                merged[k] = nums2[j];
                k+=1;
                j+=1;

            }
        }

        while (i<nums1.length){
            merged[k] = nums1[i];
            k+=1;
            i+=1;

        }


        while (j<nums2.length){
            merged[k] = nums2[j];
            k+=1;
            j+=1;
        }

        if ((m+n)%2==1)
            return Double.valueOf(merged[(m+n)/2]);
        else
            return ((Double.valueOf(merged[(m+n)/2-1]) + Double.valueOf(merged[(m+n)/2]))/2);


    }

    public static void main (String args[]){
        int [] nums1={1,2};
        int [] nums2={3,4};

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
