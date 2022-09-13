public class Tercer_ejercicio {
    public static void main(String[] args){
    persona uno = new persona();
    uno.setNombre("Julian");
    uno.setEdad(14);
    uno.setTelefono("913234657");
    System.out.println(uno.getNombre());
    System.out.println(uno.getEdad());
    System.out.println(uno.getTelefono());
    }
}
class persona{
    private String nombre;
    private int edad;
    private String telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return telefono;
    }


}