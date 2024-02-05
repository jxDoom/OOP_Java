package main.clients.type_animals;

import main.clients.Animal;
import main.clients.Illness;
import main.clients.Owner;

import java.time.LocalDate;

public class Fish extends Animal {
    public Fish(String name, Owner owner, LocalDate birthDate, Illness illness) {
        super(name, owner, birthDate, illness);
    }

    @Override
    public void toGo() {
        System.out.println(name + " не умеет ходить!");
    }

    @Override
    public void fly() {
        System.out.println(name + " не умеет летать!");
    }

    @Override
    public void hunt() {
        System.out.println(name + " не умеет охотиться!");
    }
}
