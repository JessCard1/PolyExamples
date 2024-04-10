package org.generation.italy.polyexamples.interfaces;

public interface Animale {
    String name = "Ciccio"; //non variabile ma costante statica
    default void mangia(){
        System.out.println("Mangio come un animale generico");
    }
    void muovi();
    void respira();
    Animale partorisci();
    default void saluta(){
        System.out.println("Ciao ciao!");
    }
    static Animale dammiAnimalePiuSimpa(){
        return new Delfino();
    }

    int NUMERO_MASSIMO_ZAMPE = 4;
}
