package EjercicioTema4;

public class SmartWatch extends SmartDevice{
    boolean sumergible;

    public SmartWatch(){}

    public SmartWatch(String fabricante, String modelo, boolean sumergible){
        super(fabricante, modelo);
        this.sumergible = sumergible;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "sumergible=" + sumergible +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
