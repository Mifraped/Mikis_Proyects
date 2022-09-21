package poo.interfaz;

public class CocheCRUDimpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("estoy en el metodo save");
    }

    @Override
    public void findAll() {
        System.out.println("estoy en el metodo findAll");

    }

    @Override
    public void delete() {
        System.out.println("estoy en el metodo delete");

    }
}
