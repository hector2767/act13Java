package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List nombres = new LinkedList<>();
        nombres.add("Hector");
        nombres.add("Jean");
        nombres.add("Joel");
        nombres.add("Manuel");
        nombres.add("Christian");
        nombres.add("Ernesto");
        nombres.add("Veronica");
        nombres.add("Sergio");
        nombres.add("Arroz");
        nombres.add("Zacarias");
        nombres.add("Pedro");
        nombres.add("Pablo");

        Collections.sort(nombres);

        for (Object nombre : nombres) {
            System.out.println(nombre);
        }

    }
}
