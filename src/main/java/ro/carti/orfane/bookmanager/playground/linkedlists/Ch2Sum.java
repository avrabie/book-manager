package ro.carti.orfane.bookmanager.playground.linkedlists;

public class Ch2Sum {

    public static void main(String[] args) {

        MyLinkedList myLinkedList1 = MyLinkedList.generateLinkedList(3);

        MyLinkedList myLinkedList2 = MyLinkedList.generateLinkedList(3);
        MyLinkedList sum = addLists(myLinkedList1, myLinkedList2);
        System.out.println(sum);

    }

    private static MyLinkedList addLists(MyLinkedList myLinkedList1, MyLinkedList myLinkedList2) {
        Node head1 = myLinkedList1.getHead();
        Node head2 = myLinkedList2.getHead();
        MyLinkedList mySum = new MyLinkedList();
        int mind = 0;
        while (head1 != null && head2 != null) {
            int sumDigits = head1.x + head2.x + mind;
            if (sumDigits > 9) {
                mySum.addNode(new Node(sumDigits%10));
                mind = 1;
            } else {
                mySum.addNode(new Node(sumDigits));
                mind = 0;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        Node remaining = null;
        if (head1 != null) {
            remaining = head1;
        } else if (head2 != null) {
            remaining = head2;
        }
        if (mind == 1 && remaining == null) {
            mySum.addNode(new Node(1));
        } else if(remaining!=null) {
            mySum.addNode(new Node(remaining.x+mind));
            mind = 0;
        }
        return mySum;
    }




}
