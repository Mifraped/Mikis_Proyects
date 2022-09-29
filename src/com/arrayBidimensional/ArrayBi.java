package com.arrayBidimensional;

public class ArrayBi {
    public static void main(String[] args) {
        float[][] arrayBi = {{0.0f,0.1f,0.2f,0.3f},{1.0f,1.1f,1.2f,1.3f}};
        for (int i = 0; i < arrayBi.length; i++){
            for (int j = 0; j < arrayBi[i].length; j++){
                System.out.println(arrayBi[i][j]);
            }
        }
    }
}
