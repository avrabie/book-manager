package ro.carti.orfane.bookmanager.playground.linkedlists;

public class Ch2InverseLinkedList {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = MyLinkedList.generateLinkedList(5);
        System.out.println(myLinkedList);
//        MyLinkedList inversed = myLinkedList.inverse();
        MyLinkedList inversed = myLinkedList.inverseInPlace();
        System.out.println(inversed);
        inversed.addNode(new Node(33));
        System.out.println(inversed);
    }

}
