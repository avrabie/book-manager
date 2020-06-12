package ro.carti.orfane.bookmanager.playground.linkedlists;

import ro.carti.orfane.bookmanager.playground.DSEmptyException;

public class MyPlatesStack<T> {


    PlatesStack top;


    public MyPlatesStack(int capacity) {
        this.top = new PlatesStack(capacity);
    }

    private class Plate<T> {

        private T data;
        private Plate next;
        private int nr;

        public Plate(T data) {
            this.data = data;
        }
    }

    private class PlatesStack<T> {

        PlatesStack next;
        private int nr = 0;
        private int capacity;
        private Plate topPlate;
        private int stackNr;

        public PlatesStack(int capacity) {
            this.capacity = capacity;
            // capacity should not be smaller than 1
            nr = 0;
            stackNr = 0;
        }
        public PlatesStack(int capacity, int stackNr) {
            this(capacity);
            this.stackNr = stackNr;
        }

        public void push(T data) {
            System.out.println("Pushing: "+data);
            if (nr < capacity) {
                Plate<T> tPlate = new Plate<>(data);
                tPlate.next = topPlate;
                topPlate = tPlate;
                nr = nr + 1;
            } else {
                System.out.println("Plate Stack Full!");
                PlatesStack<T> newPlatesStack = new PlatesStack<>(capacity, stackNr+1);
                newPlatesStack.push(data);
                newPlatesStack.next = this;
                top = newPlatesStack;
            }
        }

        public T pop() {
            if (nr > 0) {
                Plate result = topPlate;
                topPlate = topPlate.next;
                nr = nr - 1;
                return (T) result.data;
            }
            if (next != null) {
                System.out.println("Plate Stack Empty!");
                top = top.next;
                return (T) top.pop();
            } else {
                throw new DSEmptyException();
            }

        }

        public T peek() {
            if (nr > 0) {
                Plate result = topPlate;
                return (T) result.data;
            }
            if (next != null) {
                top = top.next;
                return (T) top.peek();
            } else {
                throw new DSEmptyException();
            }
        }
    }

    public void push(T data){
        top.push(data);
    }

    public T pop(){
        return (T) top.pop();
    }

    public T peek(){
        return (T) top.peek();
    }

    public T popFrom(int index) {
        // assuming 1 indexing
        if (index > top.stackNr) {
            return null; // throw ex
        }
        PlatesStack temp = top;
        while (temp.stackNr > index) {
            temp = temp.next;
        }
        System.out.println("Removing from stack :"+index);
        return (T) temp.pop();
    }

    public static void main(String[] args) {
        MyPlatesStack<Integer> myPlatesStack = new MyPlatesStack(5);
        myPlatesStack.push(5);
        System.out.println(myPlatesStack.peek());
        myPlatesStack.push(7);
        System.out.println(myPlatesStack.peek());
        myPlatesStack.push(3);
        System.out.println("Popping first:"+myPlatesStack.pop());
        myPlatesStack.push(4);
        myPlatesStack.push(1);

        myPlatesStack.push(2);
        myPlatesStack.push(8);
        System.out.println("the number:"+myPlatesStack.top.nr);
        myPlatesStack.push(4);
        myPlatesStack.push(1);
        myPlatesStack.push(2);
        myPlatesStack.push(5);
        myPlatesStack.push(6);
        myPlatesStack.push(71);
        myPlatesStack.push(1);
        myPlatesStack.push(2);
        myPlatesStack.push(3);
        myPlatesStack.push(4);

        System.out.println(myPlatesStack.popFrom(2));
        System.out.println(myPlatesStack.pop());
        System.out.println(myPlatesStack.pop());
        System.out.println(myPlatesStack.pop());
        System.out.println(myPlatesStack.pop());
        System.out.println(myPlatesStack.pop());
        System.out.println(myPlatesStack.pop());
        System.out.println(myPlatesStack.pop());
        System.out.println(myPlatesStack.pop());
        System.out.println(myPlatesStack.pop());

    }

}
