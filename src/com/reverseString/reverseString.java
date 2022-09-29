package com.reverseString;

public class reverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Hola mundo"));
    }
    public static String reverse(String texto){
        String textoreversed = "";
        for (int i = texto.length() - 1; i >= 0; i--){
            textoreversed += texto.charAt(i);
        }
        return textoreversed;
    }
}
