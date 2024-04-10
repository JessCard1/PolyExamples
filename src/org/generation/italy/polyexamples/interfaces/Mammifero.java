package org.generation.italy.polyexamples.interfaces;

public abstract class Mammifero implements Animale {
    private int peso;
    private String colore;

    public Mammifero(int peso, String colore) {
        this.peso = peso;
        this.colore = colore;
    }

    public int getPeso() {
        return peso;
    }
    public String getColore() {
        return colore;
    }

    @Override
    public Mammifero partorisci(){
        System.out.println("Partorirai nel dolore");
        return null;
    }

}
