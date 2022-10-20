package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {


        Map<String, String> personas = new HashMap<>();

        personas.put("36850591", "Nombre Apellido 1");
        personas.put("36850591", "Nombre Apellido 2");
        personas.put("36850591", "Nombre Apellido 3");
        System.out.println(personas);

    }
}
