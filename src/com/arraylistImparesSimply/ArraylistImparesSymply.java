package com.arraylistImparesSimply;

import java.util.ArrayList;

public class ArraylistImparesSymply {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                numeros.add(i);
                System.out.println(i);
            }
        }
    }
}
