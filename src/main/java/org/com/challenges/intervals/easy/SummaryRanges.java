package org.com.challenges.intervals.easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();

        List<String> string = new ArrayList<>();
        int start = nums[0];
        int end = nums[0];
        int i = 0;

       while(i  < nums.length){
           if(i != nums.length - 1 ){
               if(nums[i]+1 == nums[i+1]){
                   end = nums[i+1];
                   i++;
               }else{
                   if(start == end){
                       string.add(String.valueOf(start));
                       i++;
                       start = end = nums[i];
                       end = nums[i];
                   }else{
                       string.add(start + "->" + String.valueOf(end));
                       i++;
                       start = end = nums[i];
                       end = nums[i];
                   }
               }
           }else{
               if(start == end){
                   string.add(String.valueOf(start));
                   i++;
               }else{
                   string.add(start + "->" + String.valueOf(end));
                   i++;
               }
           }
        }
        return string;
    }

    public static void main(String args[]){
        int[] nums = {0,1,2,4,5,7};
        summaryRanges(nums);
    }
}
