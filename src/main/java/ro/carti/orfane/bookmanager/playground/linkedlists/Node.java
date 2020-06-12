package ro.carti.orfane.bookmanager.playground.linkedlists;

public class Node {

    public int x;
    public Node next = null;

    public Node(int x) {
        this.x = x;
    }

    public Node(Node current) {
        this.x = current.x;
        this.next = null;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
