package core.list.linkedlist.util;

import core.list.linkedlist.impl.GBLinkedList;

import java.util.Iterator;

public class LinkedIterator<E> implements Iterator<E> {
    private GBLinkedList<E> list;
    int count;

    public LinkedIterator(GBLinkedList<E> list, int count) {
        this.list = list;
        this.count = 0;
    }

    public LinkedIterator() {
    }

    @Override
    public boolean hasNext() {
        return count < list.size();
    }

    @Override
    public E next() {
        return list.get(count++);
    }
}
