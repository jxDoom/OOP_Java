package main.clients.type_animals;

import main.clients.type_animals.actions.Swimable;
import main.clients.Animal;
import main.clients.Illness;
import main.clients.Owner;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable {
    public Fish(String name, Owner owner, LocalDate birthDate, Illness illness) {
        super(name, owner, birthDate, illness);
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " не умеет охотиться");
    }

    @Override
    public double swim() {
        return 20D;
    }
}
