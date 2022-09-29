package program;


import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static <K, V> K getKey(Map<K, V> map, V value)
    {
        for (Map.Entry<K, V> entry: map.entrySet())
        {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
    public static void main(String[] args) {

        Map<String,String> contrasenyas = new HashMap<>();
        contrasenyas.put("CONTRASENYAMAMA", "Mama");
        contrasenyas.put("CONTRASENYAPAPA", "Papa");
        contrasenyas.put("CONTRASENYACARLITOS", "Carlitos");
        contrasenyas.put("CONTRASENYAPEDRITO", "Pedrito");

        ArrayList<String> listaCompra = new ArrayList<>();
        listaCompra.add("Pepinos");
        listaCompra.add("Nabos");
        listaCompra.add("Berzas");
        listaCompra.add("Melones");
        listaCompra.add("Malacatones");

        String usuario = "";
        boolean ok = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduzca nombre de usuario");
            try {
                usuario = scanner.next();
                if (contrasenyas.containsValue(usuario)){
                    ok = true;
                }else{
                    System.out.println("Usuario no registrado");
                }
            } catch (Exception e) {
                System.out.println("Usuario no valido" + e.getMessage());
            }
        }while (!ok);
        ok = false;
        do {
            System.out.println("Introduzca contraseña");
            Scanner scanner = new Scanner(System.in);
                try{
                    String contrasenya = scanner.next();
                    String key = getKey(contrasenyas, usuario);
                    if (contrasenya.equals(key)){
                        ok = true;
                    } else {
                        System.out.println("Contraseña incorrecta");
                    }
                }catch (Exception e){
                    System.out.println("Contraseña no valida" + e.getMessage());
                }
        }while (!ok);

        try {
            PrintStream imprimeLista = new PrintStream("C:/Users/Miki/ListaDeLaCompra.txt");
            imprimeLista.write(String.valueOf(listaCompra).getBytes());
        }catch (Exception e){
            System.out.println("No se puede imprimir la lista" + e.getMessage());
        }
    }
}
