package main.clients.type_animals;

import main.actions.Goable;
import main.actions.Huntable;
import main.clients.Animal;
import main.clients.Illness;
import main.clients.Owner;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Huntable {
    public Cat(String name, Owner owner, LocalDate birthDate, Illness illness) {
        super(name, owner, birthDate, illness);
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " охотится ночью");
    }
}
