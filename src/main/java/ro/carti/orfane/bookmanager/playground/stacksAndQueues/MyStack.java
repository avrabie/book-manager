package ro.carti.orfane.bookmanager.playground.stacksAndQueues;

import ro.carti.orfane.bookmanager.playground.DSEmptyException;

public class MyStack<T> {
    private static class Node<T> {
        private T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }
    }
    private Node head;

    public void push(T data) {
        Node<T> tNode = new Node<>(data);
        tNode.next = head;
        head = tNode;

    }

    public T pop() {
        T data = peek();
        head = head.next;
        return data;
    }

    public T peek() {
        if (isEmpty()) throw new DSEmptyException();
        T data = (T) head.data;
        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }


}
