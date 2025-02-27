package org.com.challenges.easy.arrays;

public class StrStr {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        return haystack.indexOf(needle);
    }
}
