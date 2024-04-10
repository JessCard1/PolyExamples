package org.generation.italy.polyexamples.model;

public class Tiger extends Animal {
    private double canineLength;

    public Tiger(double weight, String color, int age, boolean dangerous, double canineLength) {
        super(weight, color, age, dangerous);
        this.canineLength = canineLength;
    }
    // @Override
    public void eat(){
        if(isDangerous()){
            System.out.println("Me magno il custode");
            if(canineLength > 5){
                System.out.println("Almeno è morto velocemente");
            }
        } else {
            System.out.println("Me magno quello che  mi ha portato il custode");
        }
    }
    @Override
    public void move(){
        jump();
    }
    public void jump(){
        System.out.println("Salto cinque volte la mia statura");
    }
}
