public class LinkedListQueue {
    private Node head;
    private Node tail;

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void enqueue (int value) {
        Node newNode= new Node(value);
        if(tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if(head == null){
            head = tail;
        }
    }

    public int dequeue(){
        if(isEmpty()) {
            System.out.println(("Queue is empty, cannot dequeue. Underflow error"));
            return -1;
        } else {
            int result = head.data;
            head = head.next;
            if(head == null) {
                tail = null;
            }
            return result;
        }
    }

    public int peek(){
        if(isEmpty()) {
            System.out.println(("Queue is empty, cannot dequeue. Underflow error"));
            return -1;
        } else {
            return head.data;
        }
    }

    public static void main(String[] args){
        LinkedListQueue myQueue = new LinkedListQueue();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        System.out.println("Peeked: "+myQueue.peek());
        System.out.println(("Dequeued: "+ myQueue.dequeue()));
        System.out.println(("Dequeued: "+ myQueue.dequeue()));
        System.out.println("Peeked: "+myQueue.peek());
        System.out.println(("Dequeued: "+ myQueue.dequeue()));
        System.out.println("Peeked: "+myQueue.peek());

    }
}
