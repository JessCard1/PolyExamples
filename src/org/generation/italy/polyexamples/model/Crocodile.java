package org.generation.italy.polyexamples.model;

public class Crocodile extends Animal {
    private double biteForce;

    public Crocodile(double weight, String color, int age, boolean dangerous, double biteForce){
        super(weight, color, age, dangerous);
        this.biteForce = biteForce;
    }
    // @Override
    public void eat(){
        if(isDangerous()){
            System.out.println("Me magno il custode con un boccone");
        } else {
            System.out.println("Ma ti pare che un coccodrillo possa non essere pericoloso");
            if(biteForce > 10){
                System.out.println("Non è rimasto niente del custode");
            }
        }
    }
    @Override
    public void move(){
        roll();
    }
    public void roll(){
        System.out.println("Spezzetto la preda");
    }
    @Override
    public Crocodile reproduce(){
        return new Crocodile(100, "green", 10, isDangerous(), 10);
    }
}
