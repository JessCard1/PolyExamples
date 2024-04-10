package org.generation.italy.polyexamples.interfaces;

public class Delfino extends Mammifero implements Pesce{
    public Delfino(int peso, String colore) {
        super(peso, colore);
    }

    @Override
    public void mangia() {
        System.out.println("Mangio le sardine");
    }

    @Override
    public void muovi() {
        System.out.println("Nuoto fra le onde");
    }

    @Override
    public void respira() {
        System.out.println("Vivo sott'acqua ma respiro aria");
    }

    @Override
    public Delfino partorisci() {
        return new Delfino(3,"blu");
    }

    @Override
    public void nuota() {
        muovi();
    }

}
