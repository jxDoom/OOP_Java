package main.clients;

import main.clients.type_animals.Cat;

import java.time.LocalDate;

public class Animal {
    protected String name;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    public Animal(String name, Owner owner, LocalDate birthDate, Illness illness) {
        this.name = name;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public String getName() {
        return name;
    }

//    public Owner getOwner() {
//        return owner;
//    }
//
//    public LocalDate getBirthDate() {
//        return birthDate;
//    }
//
//    public Illness getIllness() {
//        return illness;
//    }
//
//    public void setIllness(Illness illness) {
//        this.illness = illness;
//    }

    public void toGo() {
        System.out.print("ходит");
    }

    public void fly() {
        System.out.print("летает");
    }

    public void swim() {
        System.out.print("плавает");
    }

    public void hunt() {
        System.out.print("охотится");
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Birth Date: %s, Owner: %s, Illness: %s", name, birthDate, owner, illness);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Animal)) return false;
//        Animal a = (Animal) obj; // операция каста (приведение типов)
//        if (this.id = a.id) return true;
//    }

//    public static void todo() {
//        for (int i = 0; i < animals.size(); i++) {
//            Animal an = animals.get(i);
//            if (an instanceof Cat) ((Cat) an).meow(); //операция каста и операция instanceof дорогостоящие,
//            влияют на производительность, их не должно быть много в коде
//        }
//    }
}
