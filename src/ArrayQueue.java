public class ArrayQueue {
    private int maxSize;
    private int numElements;
    private int front;
    private int rear;
    private int[] queueArray;

    public ArrayQueue(int size) {
        maxSize = size;
        numElements = 0;
        queueArray = new int[maxSize];
        front=0;
        rear =-1;
    }

    public boolean isEmpty() {
        return (numElements == 0);
    }
    public boolean isFull() {
        return (numElements == maxSize);
    }
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full, cannot enqueue. Overflow error");
        } else {
            rear = (rear +1)% maxSize;
            queueArray[rear] = value;
            numElements++;
        }

    }

    public int dequeue() {
        if(isEmpty()){
            System.out.println("Queue is empty, cannot dequeue. Underflow error");
            return -1;
        } else {
            int result = queueArray[front];
            front = (front + 1) % maxSize;
            numElements--;
            return result;
        }
    }
    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue.Underflow error.");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    public static void main(String[] args) {
        ArrayQueue myQueue = new ArrayQueue(10);
        myQueue.enqueue(1);
        myQueue.enqueue(10);
        myQueue.enqueue(100);
        myQueue.enqueue(10000);
        myQueue.enqueue(1000000);
        myQueue.enqueue(100000000);
        myQueue.enqueue(112312312);
        myQueue.enqueue(99999999);
        myQueue.enqueue(8888888);
        myQueue.enqueue(7777777);

        System.out.println("Peeked: "+myQueue.peek());
        System.out.println(("Dequeued: "+ myQueue.dequeue()));
        System.out.println(("Dequeued: "+ myQueue.dequeue()));
        System.out.println(("Dequeued: "+ myQueue.dequeue()));
        System.out.println(("Dequeued: "+ myQueue.dequeue()));
        System.out.println("Peeked: "+myQueue.peek());
        System.out.println(("Dequeued: "+ myQueue.dequeue()));
        System.out.println(("Dequeued: "+ myQueue.dequeue()));
        System.out.println(("Dequeued: "+ myQueue.dequeue()));
        System.out.println(("Dequeued: "+ myQueue.dequeue()));
        System.out.println("Peeked: "+myQueue.peek());


    }
}
