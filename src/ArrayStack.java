public class ArrayStack {

    private int maxSize;
    private int top;
    private int[] stackArray;

    public ArrayStack(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public boolean isEmpty(){
        return( top == -1);
    }
    public boolean isFull() {
        return (top == maxSize);
    }
    public void push (int value){
        if(isFull()){
            System.out.println("Stack is full, cannot push. Overflow error. ");
        } else {
            stackArray[++top] = value;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty, cannot pop. Underflow error");
            return -1;
        } else {
            return stackArray[top--] ;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty, cannot peek. Underflow error");
            return -1;
        } else {
            return stackArray[top] ;
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

    }


}

