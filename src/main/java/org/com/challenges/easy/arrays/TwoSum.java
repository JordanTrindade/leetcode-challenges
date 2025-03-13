package org.com.challenges.easy.arrays;

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] num, int target){
        Map<Integer, Integer> nuns = new HashMap<>(); //map onde key = num do array, valor = posicao
        for(int i = 0; i <= num.length; i++){
            int complemento = target - num[i];
            if(nuns.containsKey(complemento)){
                return new int[]{nuns.get(complemento), i} ;
            }
            nuns.put(num[i], i);
        }
        return new int[]{};
    }
}
