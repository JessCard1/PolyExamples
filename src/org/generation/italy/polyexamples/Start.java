package org.generation.italy.polyexamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.generation.italy.polyexamples.model.Animal;
import org.generation.italy.polyexamples.model.AnimalHandler;
import org.generation.italy.polyexamples.model.Crocodile;
import org.generation.italy.polyexamples.model.Donkey;
import org.generation.italy.polyexamples.model.Tiger;

public class Start {
    public static void main(String[] args) {
        Tiger tigre = new Tiger(200.0, "arancionero", 15, true, 10.0);
        Donkey don = new Donkey(200.0, "grigio", 10, false, 20.0);
        AnimalHandler ah = new AnimalHandler("Ciccio", "Pasticcio");
        ah.handle(tigre);
        ah.handle(don);
        Crocodile coco = new Crocodile(200.0, "verde", 7, false, 20.0);
        ah.handle((Animal)coco);
        Animal[] animals = {tigre, don, coco};
        ah.handleAll(animals);
        Animal z = (Animal)coco;
        if(Math.random() > 0.5) {
            z = tigre;
        } else {
            z = don;
        }
        z.eat();
        if(z instanceof Crocodile ){
            Crocodile coco2 = (Crocodile)z; // downcast 
        }
        ArrayList<Animal> as = new ArrayList<>();
        Collections.sort(as);
        Animal an = new Crocodile(200, "green", 7, true, 10);
        Animal son2 = an.reproduce();
        Animal son = an.reproduce();
        an.eat();
        an.wash();
        Crocodile c1 = new Crocodile(200, "green", 7, true, 10);
        Crocodile c2 = c1.reproduce();
        // Animal q = new Animal(200, "green", 7, true);
        Animal zz = new Donkey(200, "green", 7, false, 10);
        zz.eat();
    }

}
