package Queues;

public class CircularArrayQueue {
    private int[] arr;
    private int size;
    private int maxSize;
    private int front;
    private int rear;

    public static int default_capacity = 10;

    CircularArrayQueue(){
        this(default_capacity);
    }

    CircularArrayQueue(int capacity){
        this.arr = new int[capacity];
        this.size = 0;
        this.maxSize = capacity;
        this.front = 0;
        this.rear = capacity - 1;
    }

    public boolean isFull(){
        return this.size == this.maxSize;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void enqueue(int data) {
        if (!isFull()) {
            this.rear = (this.rear + 1) % this.arr.length;
            this.arr[this.rear] = data;
            this.size += 1;
        }
    }

    public void dequeue(){
        if (!isEmpty()){
            this.front = (this.front+1)%this.arr.length;
            this.size -=1;
        }
    }

    public int getFront(){
        return this.arr[this.front];
    }

    public static void main(String[] args) throws Exception {
        CircularArrayQueue cq = new CircularArrayQueue(6);
        for (int i = 1; i < 7; i++){
            cq.enqueue(i);
        }

        System.out.println(cq.getFront());
        System.out.println(cq.rear);

        cq.dequeue();

        while(!cq.isEmpty()){
            System.out.println(cq.getFront());
            cq.dequeue();
        }
    }
}
