package org.com.challenges.easy.arrays;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static int romanToInt(String s) {
        Map<Character, Integer> symbolToValue = new HashMap<>();
        int soma = 0;
        int i = 0;
        int tamanhoString = s.length();

        symbolToValue.put('I',1);
        symbolToValue.put('V',5);
        symbolToValue.put('X',10);
        symbolToValue.put('L',50);
        symbolToValue.put('C',100);
        symbolToValue.put('D',500);
        symbolToValue.put('M',1000);

        while(i < tamanhoString){
            int valorAtual = symbolToValue.get(s.charAt(i));
            if(i + 1 < tamanhoString){
                int valorProx = symbolToValue.get(s.charAt(i+1));

                if(valorAtual < valorProx){
                    soma += valorProx - valorAtual;
                    i += 2;
                    continue;
                }
            }
            soma += valorAtual;
            i++;
        }
        return soma;
    }

    public static void main(String[] args){
        System.out.println("soma : " + RomanToInt.romanToInt("MCMXCIV"));

    }
}
