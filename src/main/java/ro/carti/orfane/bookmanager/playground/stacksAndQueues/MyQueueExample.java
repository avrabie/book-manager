package ro.carti.orfane.bookmanager.playground.stacksAndQueues;

public class MyQueueExample {

    public static void main(String[] args) {
        MyQueue <Integer> myQueue = new MyQueue();
        myQueue.add(44);
        myQueue.add(11);
        myQueue.add(4);
        myQueue.add(7);
        myQueue.add(0);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());


    }

}
