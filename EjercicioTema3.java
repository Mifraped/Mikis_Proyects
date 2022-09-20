package miks;

public class EjercicioTema3 {
    public static void main(String[] args) {
        String [] nombreApellidos = {"Paco", "Jones", "Gordos"};
        String nombreCompleto = "";
        for (String nombre: nombreApellidos){
            nombreCompleto += nombre + " ";
        }
        System.out.println(nombreCompleto);
    }
}
