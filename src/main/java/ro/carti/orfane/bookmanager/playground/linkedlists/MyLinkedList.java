package ro.carti.orfane.bookmanager.playground.linkedlists;


import java.util.Random;

public class MyLinkedList {

    private Node head = null;
    private Node last = null;

    public static MyLinkedList generateLinkedList(int n) {
        MyLinkedList myLinkedList = new MyLinkedList();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            Node node = new Node(random.nextInt(10));
            myLinkedList.addNode(node);
        }

        return myLinkedList;
    }

    public Node getHead() {
        return head;
    }

    public void addNode(Node node) {
        if (this.head == null) {
            this.head = node;
            this.last = node;
            return;
        }
        last.next = node;
        last = node;
//        Node pos = this.head;
//        while (pos.next != null) {
//            pos = pos.next;
//        }
//        pos.next = node;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node node = this.head;
        while (node != null) {
            sb.append(node.x);
            if (node.next != null) {
                sb.append(" -> ");
            }
            node = node.next;
        }
        return sb.toString();
    }

    public MyLinkedList inverse() {
        MyLinkedList result = new MyLinkedList();
        Node current = head;
        Node chain = null;

        while (current != null) {
            Node temp = new Node(current);
            if (result.head == null) {
                result.last = temp;
            }
            result.head = temp;
            result.head.next = chain;
            chain = result.head;
            current = current.next;
        }

        return result;
    }

    public MyLinkedList inverseInPlace() {
        Node newHead = null;
        Node chain = null;
        Node current = this.head;
        this.last = this.head;

        while (current!=null){
            newHead = current;
            current = current.next;
            newHead.next = chain;
            chain = newHead;
        }

        this.head = newHead;
        this.last.next = null;
        return this;
    }
}
