package org.com.challenges.easy;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int prenchePosicao = 1;
        int tamanhoArray = nums.length;
        for(int i= 1; i < tamanhoArray; i++){
            if(nums[prenchePosicao - 1] != nums[i]){
                nums[prenchePosicao++] = nums[i];
            }
        }
        return prenchePosicao;
    }

    public static void main(String[] args){
        int[] array = {0,0,1,1,1,2,2,3};
        removeDuplicates(array);
    }
}
