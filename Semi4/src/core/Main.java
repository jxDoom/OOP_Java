package core;

import core.ex.C;
import core.ex.D;
import core.ex.Example;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
    private static List<?> objects;

    Example<?> example = new Example<>();

    public static void main(String[] args) {
//        init(new ArrayList<Integer>(), 1, 2, 3, 4, 4, 4, 5, 6, 12, 87);
        List<C> dList = List.of(new D());
        printCollection(dList);
    }

    private static <E> void init(List<E> ints, E ... obj) {
        for (E elem : obj) ints.add(elem);

        objects = ints;
        System.out.println(objects);
    }

// Есть класс A, от него наследуется класс B, от класса B наследуется класс C и от класса C наследуется класс D

    private static void printCollection (Collection<? extends C> c) { // этот метод сможет обработать C и его наследников, т.е. D
//    private static void printCollection (Collection<? super C> c) { // этот метод может обработать C, A и B
        Iterator<?> i = c.iterator();
        for (int k = 0; k < c.size(); k++) {
            System.out.println(i.next());
        }
    }
}
