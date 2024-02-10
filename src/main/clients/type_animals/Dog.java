package main.clients.type_animals;

import main.clients.type_animals.actions.Goable;
import main.clients.type_animals.actions.Huntable;
import main.clients.type_animals.actions.Swimable;
import main.clients.Animal;
import main.clients.Illness;
import main.clients.Owner;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable, Huntable {
    public Dog(String name, Owner owner, LocalDate birthDate, Illness illness) {
        super(name, owner, birthDate, illness);
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " охотится днём");
    }

    @Override
    public double swim() {
        return 3D;
    }
}
