package com.example.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MedianSorted {

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;

        int [] merged = new int [m+n];

        int i=0;
        int j=0;
        int k=0;
        double result=0.0;

        while (i<m && j<n && k<m+n){
            if (nums1[i]<=nums2[j]){
                merged[k]=nums1[i];
                i+=1;
                k+=1;
            }
            else{
                merged[k]=nums2[j];
                j+=1;
                k+=1;
            }

        }

        while (i<m){
            merged[k]=nums1[i];
            i+=1;
            k+=1;

        }

        while (j<n){
            merged[k]=nums2[j];
            j+=1;
            k+=1;

        }

        System.out.println(Arrays.toString(merged));


        if ((m+n)%2!=0){
            result=Double.valueOf(merged[((m+n)/2)]);
            return result;
        }

        result=(Double.valueOf(merged[((m+n)/2)])+Double.valueOf(merged[((m+n)/2)-1]))/2;
        return result;



    }

    public static void main (String args[]){
        int [] nums1={1,2};
        int [] nums2={3,4};

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
