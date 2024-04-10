package org.generation.italy.polyexamples.model;

public class Donkey extends Animal {
    private double earLength;

    public Donkey(double weight, String color, int age, boolean dangerous, double earLength) {
        super(weight, color, age, dangerous);
        this.earLength = earLength;
    }
    @Override
    public void move(){
        run();
    }
    public void run() {
        System.out.println("Vado al trotto");
    }
    @Override
    public Donkey reproduce(){
        return new Donkey(100,"grey",20,false, 5.5);
    }
    public void eat(){
        
    }
}
