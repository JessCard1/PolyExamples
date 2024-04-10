package org.generation.italy.polyexamples.model;

public class AnimalHandler {
    private String name;
    private String lastName;

    public AnimalHandler(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    // public void handle(Tiger t){
    //     t.eat();
    //     t.wash();
    //     if(t.isDangerous()){
    //         t.bite();
    //     }
    // }
    // public void handle(Donkey d){
    //     d.eat();
    //     d.wash();
    //     if(d.isDangerous()){
    //         d.bite();
    //     }
    // }
    public void handle(Animal a){
        a.eat();
        a.wash();
        if(a.isDangerous()){
            a.bite();
        }
        // if (a instanceof Crocodile c){
        //     c.roll();
        // } else if (a instanceof Donkey d) {
        //     d.run();
        // } else if (a instanceof Tiger t){
        //     t.jump();
        // }
        a.move();
    }
    public void handleAll(Animal[] animals){
        for(Animal a : animals){
            handle(a);
        }
    }
    public static void main(String[] args) {
        Animal a = new Crocodile(150, "green", 11, true, 10);
        a.eat();
    }

}
