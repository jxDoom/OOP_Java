package main.clients.type_animals;

import main.clients.type_animals.actions.Flyable;
import main.clients.type_animals.actions.Goable;
import main.clients.Animal;
import main.clients.Illness;
import main.clients.Owner;

import java.time.LocalDate;

public class Parrot extends Animal implements Goable, Flyable {
    public Parrot(String name, Owner owner, LocalDate birthDate, Illness illness) {
        super(name, owner, birthDate, illness);
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " не умеет охотиться");
    }

    @Override
    public double fly() {
        return 12D;
    }

    @Override
    public Double run() {
        return 2D;
    }
}
