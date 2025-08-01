package org.com.challenges.arrays.medium;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int count= 0;
        int writeIndex= 2;
        for(int i=2;i<nums.length;i++){
            if(nums[i] != nums[writeIndex-2]){
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }
        return writeIndex;
    }

    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,3};
        removeDuplicates(nums);
    }
}
