package org.com.challenges.arrays.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        return strings[strings.length - 1].length();
    }
}
