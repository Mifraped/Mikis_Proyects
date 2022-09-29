package com.inOut;

import java.io.*;

public class InOut {
    public static void main(String[] args) {
        filecopy("C:/Users/Miki/Prueba.txt", "C:/Users/Miki/copiaPrueba.txt");
    }
    public static void filecopy(String fileIn, String fileOut){
        try{
            InputStream archivo = new FileInputStream(fileIn);

            byte[] datos = archivo.readAllBytes();
            archivo.close();

            PrintStream copiaArchivo = new PrintStream(fileOut);
            copiaArchivo.write(datos);
            copiaArchivo.close();

        }catch ( Exception e){
            System.out.println(e.getMessage());
        }
    }
}
