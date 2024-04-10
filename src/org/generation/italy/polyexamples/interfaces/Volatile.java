package org.generation.italy.polyexamples.interfaces;

public interface Volatile {
    void vola();
    default void mangia(){
        System.out.println("Becchetto il mais sul selciato");
    }

}
