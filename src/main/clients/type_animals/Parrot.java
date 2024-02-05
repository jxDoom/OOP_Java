package main.clients.type_animals;

import main.clients.Animal;
import main.clients.Illness;
import main.clients.Owner;

import java.time.LocalDate;

public class Parrot extends Animal {
    public Parrot(String name, Owner owner, LocalDate birthDate, Illness illness) {
        super(name, owner, birthDate, illness);
    }

    @Override
    public void swim() {
        System.out.println(name + " не умеет плавать!");
    }

    @Override
    public void hunt() {
        System.out.println(name + " не умеет охотиться!");
    }
}
