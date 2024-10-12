package org.example;

import animal.Animal;
import animal.fish.Eel;
import animal.fish.Fish;

public class Main {
    public static void main(String[] args) {

        Animal animal=new Animal();
        System.out.println(animal);
        Fish fish=new Fish();
        System.out.println(fish);
        Eel eel = new Eel();
        System.out.println(eel);
    }
}