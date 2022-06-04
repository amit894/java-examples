package com.example.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergedSorted {
    private  static void  merge(int[] nums1, int m, int[] nums2, int n) {
        int [] nums1Copy = new int [m];
        for ( int i=0; i<m;i++){
            nums1Copy[i]=nums1[i];
        }
        int i=0;
        int j=0;
        int k=0;

        while (i<m && j<n && k<m+n){
            if (nums1Copy[i]<nums2[j]){
                nums1[k]=nums1Copy[i];
                i+=1;
                k+=1;
            }
            else {
                nums1[k]=nums2[j];
                j+=1;
                k+=1;

            }
        }

        while (i<m){
            nums1[k]=nums1Copy[i];
            i+=1;
            k+=1;

        }

        while (j<n){
            nums1[k]=nums2[j];
            j+=1;
            k+=1;

        }


    }

    public static void main (String args []){
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));

    }

}
