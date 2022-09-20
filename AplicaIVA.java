package miks;

public class AplicaIVA {
    public static void main(String[] args) {
        double ivaAplicado = aplicaIVA(584.99);
        System.out.println("El precio final es " + ivaAplicado);
    }
    public static double aplicaIVA(double precio){
        double iva = (precio * 21 / 100) + precio;
        return iva;
    }
}
