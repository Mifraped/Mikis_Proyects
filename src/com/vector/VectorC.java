package com.vector;

import java.util.Vector;

public class VectorC {
    public static void main(String[] args) {
        Vector<String> persons = new Vector<>();
        persons.add("Budy");
        persons.add("Santi el ninja");
        persons.add("Jimmy ferrol");
        persons.add("Mastrich");
        persons.add("Puto Muñeco");
        System.out.println(persons);
        persons.remove(1);
        persons.remove(1);
        System.out.println(persons);
        System.out.println("Tamaño: " + persons.size() + " Capacidad: " + persons.capacity());
        persons.trimToSize();
        System.out.println("Tamaño: " + persons.size() + " Capacidad: " + persons.capacity());
        for (String nombre: persons){
            System.out.println(nombre);
        }
        for (int i = 0; i < persons.size(); i++){
            System.out.println(persons.get(i));
        }
    }
}
