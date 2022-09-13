package miks;

public class CuartoEjercicio {
    public static void main(String[] args){
        Cliente uno = new Cliente();
        uno.setPropiedades(24,"Juan","913237593");
        uno.setCredito("54$");
        System.out.println(uno.getEdad()+" "+uno.getNombre()+" "+uno.getTelefono()+" "+ uno.getCredito());
        Trabajador ochocientos = new Trabajador();
        ochocientos.setPropiedades(63, "Bartolome", "5793652");
        ochocientos.setSalario("1000$");
        System.out.println(ochocientos.getEdad()+" "+ochocientos.getNombre()+" "+ochocientos.getTelefono()+" "+ochocientos.getSalario());
    }
}
class Persona{
    int edad;
    String nombre;
    String telefono;
    public Persona(){}
    public void setPropiedades(int edad, String nombre, String telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
}
class Cliente extends Persona{
    String credito;
    public void setCredito(String credito){
        this.credito = credito;
    }
    public String getCredito(){
        return this.credito;
    }
}
class Trabajador extends Persona{
    String salario;
    public void setSalario(String salario){
        this.salario = salario;
    }
    public String getSalario(){
        return this.salario;
    }
}