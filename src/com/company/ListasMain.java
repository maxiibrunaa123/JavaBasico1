package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListasMain {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Nombre1");
        nombres.add("Nombre2");
        nombres.add("Nombre3");
        nombres.add("Nombre4");
        nombres.add("Nombre5");
        System.out.println(nombres);


        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche("honda civic"));
        coches.add(new Coche("alfa romeo"));
        coches.add(new Coche("ford mondeo"));

        System.out.println(coches);

        for (Coche coche : coches) {
            System.out.println(coche);
        }

    }
}
