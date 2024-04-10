package org.generation.italy.polyexamples.interfaces;

public class Coccodrillo implements Animale {
    private int numeroZampe;

    public Coccodrillo(int numeroZampe) {
        if(numeroZampe <= NUMERO_MASSIMO_ZAMPE){
            this.numeroZampe = numeroZampe;
        } else {
            this.numeroZampe = Animale.NUMERO_MASSIMO_ZAMPE;
        }
}

    @Override
    public void mangia() {
        System.out.println("Mangio animaletti carini");
    }

    @Override
    public void muovi() {
        System.out.println("nuoto con gli occhi a pelo dell'acqua");
    }

    @Override
    public void respira() {
        System.out.println("Respiro");
    }

    @Override
    public Coccodrillo partorisci() {
        return new Coccodrillo(4);
    }
    @Override
    public void saluta(){
        System.out.println("Prima te saluto, poi me te magno");
    }

}
