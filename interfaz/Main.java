package poo.interfaz;

public class Main {
    public static void main(String[] args) {
        CocheCRUDimpl cocheCRUDimpl = new CocheCRUDimpl();
        cocheCRUDimpl.save();
        cocheCRUDimpl.findAll();
        cocheCRUDimpl.delete();

    }
}
