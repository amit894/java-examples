package com.example.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MedianSorted {

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n= nums2.length;
        int [] sorted = new int[m+n];
        float median = 0.0F;

        int i=0;
        int j=0;
        int k=0;

        while (i<m && j<n && k<m+n){
            if (nums1[i]<nums2[j]){
                sorted[k]=nums1[i];
                k+=1;
                i+=1;
            }
            else{
                sorted[k]=nums2[j];
                k+=1;
                j+=1;
            }
        }

        while (i<m){
            sorted[k]=nums1[i];
            k+=1;
            i+=1;

        }

        while (j<n){
            sorted[k]=nums2[j];
            k+=1;
            j+=1;
        }

        if ((m+n)%2==0)
            median= (Float.valueOf(sorted[((m+n)/2)-1])+Float.valueOf(sorted[((m+n)/2)]))/2;

        else
            median= Float.valueOf(sorted[((m+n)/2)]);


        return median;

    }

    public static void main (String args[]){
        int [] nums1={1,2};
        int [] nums2={3};

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
