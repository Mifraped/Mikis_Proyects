package EjercicioTema4;

public class SmartPhone extends SmartDevice{
    double screensize;

    public SmartPhone(){}

    public SmartPhone(String fabricante, String modelo, double screensize) {
        super(fabricante, modelo);
        this.screensize = screensize;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "screensize=" + screensize +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
