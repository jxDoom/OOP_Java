package core.list.linkedlist.impl;

import core.list.GBList;
import core.list.linkedlist.util.LinkedIterator;

import java.util.Iterator;

public class GBLinkedList<E> implements GBList<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size;

    public GBLinkedList() {
        lastNode = new Node<E>(null, firstNode, null);
        firstNode = new Node<E>(null, null, lastNode);
    }

    private static class Node<E> { // нода как "стопор" в списке
        private E item; // текущий элемент
        private Node<E> next; // нода следующего элемента
        private Node<E> prev; // нода предыдущего элемента

        public Node(E item, Node<E> next, Node<E> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

        public E getItem() {
            return item;
        }

        public Node<E> getNext() {
            return next;
        }

//        public Node<E> getPrev() {
//            return prev;
//        }

        public void setItem(E item) {
            this.item = item;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

//        public void setPrev(Node<E> prev) {
//            this.prev = prev;
//        }
    }

    @Override
    public void add(E elem) {
        Node<E> temp = lastNode;
        temp.setItem(elem);
        lastNode = new Node<E>(null, temp, null);
        temp.setNext(lastNode);
        size++;
    }

    @Override
    public void remove(int index) {
        if (firstNode == null || index < 0 || index >= size()) {
            System.out.println("Error: Attempting to call remove()");
        } else {
//            int tmp = (int) firstNode.getItem();
//            firstNode = firstNode.getNext();
//            tmp.
        }
    }

    @Override
    public E get(int index) {
        Node<E> target = firstNode.getNext();
        for (int i = 0; i < index; i++) target = getNextElement(target);
        return target.getItem();
    }

    private Node<E> getNextElement(Node<E> current) { // перебираемся к ноду рекурсивно
        return current.getNext();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedIterator<>();
    }
}