package core;

import core.list.GBList;
import core.list.linkedlist.impl.GBLinkedList;

import java.util.Arrays;

public class LinkedListMain {
    public static void main(String[] args) {
        GBList<Integer> linkedList = new GBLinkedList<>();

        linkedList.addLast(4);
        linkedList.addLast(15);
        linkedList.addLast(-7);
        linkedList.addLast(0);
        linkedList.addLast(-244);

//        System.out.println(linkedList);
        for (Integer i : linkedList) System.out.println(i);
    }
}