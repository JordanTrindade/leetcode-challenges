package org.com.challenges.easy;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> majority = new HashMap<>();
        Integer maiorValor = 0;
        Integer maiorChave = 0;
        for (int i = 0; i < nums.length; i++) {
            if (majority.containsKey(nums[i])) {
                majority.put(nums[i], majority.get(nums[i]) + 1);
            } else {
                majority.put(nums[i], 1);
            }
        }
        for(var maps : majority.entrySet()){
            if(maps.getValue() > maiorValor){
                maiorValor = maps.getValue();
                maiorChave = maps.getKey();
            }
        }
        return maiorChave;
    }
}
