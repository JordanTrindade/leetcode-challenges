package org.com.challenges.easy;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int tamanhoArray = nums.length;
        int prox = 0;

        for(int i = 0; i < tamanhoArray; i++){
            if(nums[i] != val){
                nums[prox++] = nums[i];
            }
        }
        return prox;
    }

    public static void main(String[] args){
        int[] array = {0,1,2,2,3,0,4,2};
        removeElement(array, 2);
    }
}
