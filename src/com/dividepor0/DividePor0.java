package com.dividepor0;

import java.util.Scanner;

public class DividePor0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el dividendo");
        int a = scanner.nextInt();
        System.out.println("Introduce el divisor");
        int b = scanner.nextInt();

        try {
            System.out.println("El resultado es: "+dividePorCero(a,b));
        }catch (ArithmeticException e){
            System.out.println("Esto no es de recibo " + e.getMessage());
        }finally {
            System.out.println("Demo de codigo");
        }
    }
    public static int dividePorCero(int a, int b) throws ArithmeticException{
        int resultado = 0;
        try {
            resultado = a / b;
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }
        return resultado;
    }
}
