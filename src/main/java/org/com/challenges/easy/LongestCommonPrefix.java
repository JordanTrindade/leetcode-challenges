package org.com.challenges.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        int i = 0 ;
        int j = 0;

        if (strs == null || strs.length == 0 || strs[0].equals("")) {
            return "";
        }
        int minLength = Integer.MAX_VALUE;
        StringBuilder commonPrefix = new StringBuilder();

        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }

        for( i = 0; i < minLength ; i++){
            char letraAtual = strs[0].charAt(i);
            for(j = 1; j < strs.length; j++){
                char letraProx = strs[j].charAt(i);
                if(letraAtual != letraProx){
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(letraAtual);
        }
        return commonPrefix.toString();
    }

    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(strs));
    }
}
