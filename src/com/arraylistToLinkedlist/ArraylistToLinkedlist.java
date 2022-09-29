package com.arraylistToLinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraylistToLinkedlist {
    public static void main(String[] args) {
        ArrayList<String> profes = new ArrayList<>();
        profes.add("Los requenos");
        profes.add("Ines puta y facha");
        profes.add("Juan Pablo");
        profes.add("Gabriel Plata");
        profes.add("Caesar");
        System.out.println(profes);
        LinkedList<String> profeslinked = new LinkedList<>(profes);

        System.out.println("ARRAYLIST");
        for (String nombres: profes){
            System.out.println(nombres);
        }
        System.out.println("LINKEDLIST");
        for (String nombres: profeslinked){
            System.out.println(nombres);
        }
    }
}
