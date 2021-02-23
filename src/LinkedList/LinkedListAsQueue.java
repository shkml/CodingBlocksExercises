package LinkedList;

public class LinkedListAsQueue {
    private LinkedList queue;

    public LinkedListAsQueue(){
        this.queue = new LinkedList();
    }

    public int size(){
        return this.queue.getSize();
    }

    public boolean isEmpty(){
        return this.queue.getSize() == 0;
    }

    public void enqueue(int data){
        this.queue.addLast(data);
    }

    public void dequeue() throws Exception{
        this.queue.removeFirst();
    }

    public int front() throws Exception{
        return this.queue.getFirst();
    }

    public void traverse() throws Exception{
        this.queue.traverse();
    }
}
