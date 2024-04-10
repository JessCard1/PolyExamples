package org.generation.italy.polyexamples.model;

public abstract class Animal implements Comparable<Animal> {
    private double weight;
    private String color;
    private int age;
    private boolean dangerous;

    public Animal (double weight, String color, int age, boolean dangerous) {
        this.weight = weight;
        this.color = color;
        this.age = age;
        this.dangerous = dangerous;
    }

    public abstract void eat(); //dichiarato ma non definito
    
    public void bite(){
        if(dangerous){
            System.out.println("Mozzico il veterinario");
        } else {
            System.out.println("Faccio solo un pò di scena");
        }
    }
    public final void wash(){
        System.out.println("Diamo una ripulita a questa bestia");
    }
    public void move(){
        System.out.println("Mi muovo in maniera generica");
    }
    public boolean isDangerous(){
        return dangerous;
    }

    @Override
    public int compareTo(Animal o) {
        // if(this.weight < o.weight) {
        //     return -1;
        // }
        // if(this.weight == o.weight) {
        //     return 0;
        // }
        // return 1;
        return (int)Math.signum(this.weight - o.weight);
    }
    public Animal reproduce(){
        return new Animal(20, "green", 5, true);
    }
}
