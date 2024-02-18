package core;

import core.list.GBList;
import core.list.impl.GBArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        GBList<Integer> list = new GBArrayList<>();

        list.add(3);
        list.add(5);
        list.add(1);
        System.out.println(list);
        System.out.println(list.get(2));

        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());
    }
}
