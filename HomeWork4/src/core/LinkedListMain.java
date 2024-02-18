package core;

import core.list.GBList;
import core.list.linkedlist.impl.GBLinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        GBList<Integer> linkedList = new GBLinkedList<>();

        linkedList.add(4);
        linkedList.add(15);
        linkedList.add(-7);
        linkedList.add(0);
        linkedList.add(-244);

        for (Integer i : linkedList) System.out.println(i);
    }
}