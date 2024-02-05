package main.clients;

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
}
