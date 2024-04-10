package org.generation.italy.polyexamples.interfaces;

public class Start {
    public static void main(String[] args) {
        Animale a = new Delfino();
        System.out.println(Animale.NUMERO_MASSIMO_ZAMPE);
        a.saluta();
        Animale x = Animale.dammiAnimalePiuSimpa();
        Volatile v = new Supereroe();
        Persona p = new Supereroe();
    }
}
