package org.generation.italy.polyexamples.interfaces;

public class Supereroe implements Persona, Volatile {

    @Override
    public void mangia(){
        System.out.println("Me magno na carbonara!");
        Volatile.super.mangia();
        Persona.super.mangia();
    }

    @Override
    public void muovi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'muovi'");
    }

    @Override
    public void respira() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'respira'");
    }

    @Override
    public Animale partorisci() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'partorisci'");
    }

    @Override
    public void vola() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vola'");
    }

    @Override
    public void parla() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'parla'");
    }

}
