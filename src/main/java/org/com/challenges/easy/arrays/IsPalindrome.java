package org.com.challenges.easy.arrays;

public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        String numberString = String.valueOf(x);

        for(int i = 0, j = numberString.length() - 1; i < j; i++, j--){
            if(numberString.charAt(i) != numberString.charAt(j)){
                return false;
            }
        }
        return true;
        /*
        *
        * solucao mais lenta
        *
        *
        String reversed = new StringBuilder(numberString).reverse().toString();
        if(numberString.equalsIgnoreCase(reversed) ){
            return  true;
        }
        return false;
        *
        */
    }

    public static void main(String[] args) {
        System.out.println(IsPalindrome.isPalindrome(10));
    }
}
