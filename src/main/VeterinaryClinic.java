package main;

import main.clients.type_animals.actions.Goable;
import main.clients.type_animals.actions.Swimable;
import main.clients.Illness;
import main.clients.Owner;
import main.clients.type_animals.Cat;
import main.clients.type_animals.Dog;
import main.clients.type_animals.Fish;
import main.clients.type_animals.Parrot;
import main.medical_staff.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Алексей", LocalDate.of(1983, 3, 15),
                true, 15, 9.73);
        Doctor doc2 = new Doctor("Сергей", LocalDate.of(1991, 12, 1),
                true, 8, 8.94);
        Assistent assist1 = new Assistent("Надежда", LocalDate.of(1998, 4, 12),
                true, 2);
        Assistent assist2 = new Assistent("Виталий", LocalDate.of(1994, 8, 24),
                true, 4);
        HeadNurse nurse1 = new HeadNurse("Светлана", LocalDate.of(1979, 6, 29),
                true, 20);
        Nurse nurse2 = new Nurse("Кристина", LocalDate.of(1994, 3, 16),
                false, 3);
        Nurse nurse3 = new Nurse("Анна", LocalDate.of(1996, 5, 30),
                false, 1);

        List<BaseStaff> listPersonal = new ArrayList<>();
        listPersonal.add(doc1);
        listPersonal.add(doc2);
        listPersonal.add(assist1);
        listPersonal.add(assist2);
        listPersonal.add(nurse1);
        listPersonal.add(nurse2);
        listPersonal.add(nurse3);
//        System.out.println(listPersonal);
        System.out.println("Количество мед. персонала в вет. клинике = " + listPersonal.size());

        System.out.println("----------------------------------------------------------------------");

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
//        System.out.println(goList);

        List<Swimable> swimList = new ArrayList<>();
        swimList.add(dog);
        swimList.add(fish);
//        System.out.println(swimList);

        System.out.println(dog.getName() + " плывет со скоростью " + dog.swim());
        System.out.println(parrot.getName() + " бежит со скоростью " + parrot.run());
        System.out.println(cat.getName() + " бежит со скоростью " + cat.run());
        System.out.println(parrot.getName() + " летит со скоростью " + parrot.fly());
        System.out.println(fish.getName() + " плывет со скоростью " + fish.swim());
        System.out.println(dog.getName() + " бежит со скоростью " + dog.run());
    }
}
