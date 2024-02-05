package main.clients.type_animals;

import main.clients.Animal;
import main.clients.Illness;
import main.clients.Owner;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String name, Owner owner, LocalDate birthDate, Illness illness) {
        super(name, owner, birthDate, illness);
    }

    @Override
    public void fly() {
        System.out.println(name + " не умеет летать!");
    }
}
