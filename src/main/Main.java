package main;

import main.clients.Animal;
import main.clients.Illness;
import main.clients.Owner;
import main.clients.type_animals.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal client1 = new Cat("Барсик", new Owner("Евгений Соколов"),
                LocalDate.of(2022, 6, 12), new Illness("Авитаминоз"));

        Animal client2 = new Dog("Ричард", new Owner("Денис Иванов"),
                LocalDate.of(2015, 2, 24), new Illness("Укусил клещ"));

        Animal client3 = new Fish(null, new Owner("Алексей Смирнов"),
                null, null);

        Animal client4 = new Parrot("Кеша", new Owner("Анна Львовна"),
                null, new Illness("Сломано крылышко"));

        ArrayList<Animal> list = new ArrayList<>();
        list.add(client4);
        list.add(client2);
        list.add(client1);
        list.add(client3);

//        System.out.println(list);

        for (Animal i : list) {
            if (i instanceof Cat){
                System.out.print(i.getName() + " ");
                i.toGo();
                System.out.print(" и ");
                i.hunt();
                System.out.println();
                i.swim();
                i.fly();
                System.out.println();
            } else if (i instanceof Dog) {
                System.out.print(i.getName() + " ");
                i.toGo();
                System.out.print(", ");
                i.hunt();
                System.out.print(" и ещё ");
                i.swim();
                System.out.println();
                i.fly();
                System.out.println();
            } else if (i instanceof Fish) {
                System.out.print(i.getName() + " ");
                i.swim();
                System.out.println();
                i.toGo();
                i.fly();
                i.hunt();
                System.out.println();
            } else if (i instanceof Parrot) {
                System.out.print(i.getName() + " ");
                i.fly();
                System.out.print(" и ");
                i.toGo();
                System.out.println();
                i.swim();
                i.hunt();
                System.out.println();
            }
        }
    }
}
