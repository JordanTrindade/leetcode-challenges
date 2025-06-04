package org.com.challenges.easy.twoPointer;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int sIndex = 0, tIndex = 0;
        int tTamanho = t.length(), sTamanho = s.length();

        while(sIndex < sTamanho && tIndex < tTamanho){
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
            }
            tIndex++;
        }
        return sIndex == sTamanho;
    }


    public static void main(String[] args) {
      boolean vdd = IsSubsequence.isSubsequence( "bb", "ahbgdc");
      System.out.println(vdd);
    }
}