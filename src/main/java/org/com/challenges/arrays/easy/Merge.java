package org.com.challenges.arrays.easy;

public class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < m + n; i++){
            for(int j = 0; j < n; j++){
                if(nums1[i] > nums2[j]){
                    int aux = nums1[i];
                    nums1[i] = nums2[j];
                    nums1[i+1] = aux;
                }
            }
        }
        for(int j = 0; j < m + n; j++){
            System.out.print(nums1[j] + " ");
        }
    }


    public static void main(String[] args){
       int[] nums1 = {1,2,3,0,0,0};
       int m = 3;
        int[]  nums2 = {2,5,6};
        int n = 3;

        merge( nums1,  m, nums2,  n);

    }
}
