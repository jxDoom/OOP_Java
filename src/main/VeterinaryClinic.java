package main;

import main.actions.Goable;
import main.actions.Swimable;
import main.clients.Illness;
import main.clients.Owner;
import main.clients.type_animals.Cat;
import main.clients.type_animals.Dog;
import main.clients.type_animals.Fish;
import main.clients.type_animals.Parrot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", new Owner("Евгений Соколов"),
                LocalDate.of(2022, 6, 12), new Illness("Авитаминоз"));

        Dog dog = new Dog("Ричард", new Owner("Денис Иванов"),
                LocalDate.of(2015, 2, 24), new Illness("Укусил клещ"));

        Fish fish = new Fish(null, new Owner("Алексей Смирнов"),
                null, null);

        Parrot parrot = new Parrot("Кеша", new Owner("Анна Львовна"),
                null, new Illness("Сломано крылышко"));

        List<Goable> goList = new ArrayList<>();
        goList.add(cat);
        goList.add(dog);
        goList.add(parrot);
        System.out.println(goList);

        List<Swimable> swimList = new ArrayList<>();
        swimList.add(dog);
        swimList.add(fish);
        System.out.println(swimList);

        System.out.println(dog.getName() + " плывет со скоростью " + dog.swim());
        System.out.println(parrot.getName() + " бежит со скоростью " + parrot.run());
        System.out.println(cat.getName() + " бежит со скоростью " + cat.run());
        System.out.println(parrot.getName() + " летит со скоростью " + parrot.fly());
        System.out.println(fish.getName() + " плывет со скоростью " + fish.swim());
        System.out.println(dog.getName() + " бежит со скоростью " + dog.run());
    }
}
