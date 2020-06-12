package ro.carti.orfane.bookmanager.playground.stacksAndQueues;

import ro.carti.orfane.bookmanager.playground.DSEmptyException;

public class MyQueue<T> {

    private static class Node<T> {

        private T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node first;
    private Node last;

    public void add(T data) {
        Node<T> tNode = new Node<>(data);
        if (last == null) {
            first = tNode;
            last = tNode;
            return;
        }
        last.next = tNode;
        last = tNode;
    }

    public T remove() {
        T data = peek();
        first = first.next;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new DSEmptyException();
        }
        T data = (T) first.data;
        return data;
    }

    public boolean isEmpty() {
        return first == null;
    }




}
