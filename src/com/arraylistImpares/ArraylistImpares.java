package com.arraylistImpares;

import java.util.ArrayList;

public class ArraylistImpares {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        System.out.println(numeros);

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 != 0) {
                numeros.remove(i);
            }
        }
        for (Integer i: numeros){
            System.out.println(i);
        }
    }
}
