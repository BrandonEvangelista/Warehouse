public class LinkedListStack {
    private Node top;

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty(){
        return (top == null);
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty, cannot pop. Underflow error");
            return -1;
        } else {
            int value = top.data;
            top = top.next;
            return value;
        }
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty, cannot pop. Underflow error");
            return -1;
        } else {
            return top.data;
        }
    }
    public static void main(String[] args){
        ArrayStack myStack = new ArrayStack(5);

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println("Peeked: "+myStack.peek());
        System.out.println("Dequeued: "+ myStack.pop());
        System.out.println("Dequeued: "+ myStack.pop());
        System.out.println("Peeked: "+myStack.peek());
        System.out.println("Dequeued: "+ myStack.pop());
        System.out.println("Peeked: "+myStack.peek());
        System.out.println("Dequeued: "+ myStack.pop());
        System.out.println("Dequeued: "+ myStack.pop());
        System.out.println("Dequeued: "+ myStack.pop());

    }
}
