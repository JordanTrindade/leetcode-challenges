package org.com.challenges.twoPointer.easy;

public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        String regex = "[^a-zA-Z0-9]+";
        String stringReplaced = s.replaceAll(regex,"").toLowerCase();
        System.out.println(stringReplaced);
        for(int i = 0, j = stringReplaced.length()-1; i < j; i++, j--){
            if(stringReplaced.charAt(i) != stringReplaced.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
