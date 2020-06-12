package ro.carti.orfane.bookmanager.playground.stacksAndQueues;

public class MyStackExample {

    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack();
        myStack.push(56);
        myStack.push(22);
        System.out.println("Peek: "+myStack.peek());
        System.out.println("Pop "+myStack.pop());
        System.out.println("Pop "+myStack.pop());


    }

}
