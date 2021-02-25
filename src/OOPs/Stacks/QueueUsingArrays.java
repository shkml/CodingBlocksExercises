package OOPs.Stacks;

public class QueueUsingArrays {

    protected int[] data;
    protected int front;

    public static final int DAFAULT_CAPACITY = 10;

    public QueueUsingArrays() throws Exception{
        this(DAFAULT_CAPACITY);
    }

    public QueueUsingArrays(int capacity) throws Exception{
        if (capacity < 1)
            throw new Exception("Invalid capacity");

        this.data = new int[capacity];
        this.front = -1;
    }

    public int size(){
        return this.front+1;
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    public void enqueue(int value) throws Exception{
        if (this.size()==this.data.length)
            throw new Exception("Queue is full");

        this.front++;
        this.data[this.front] = value;
    }

    public int dequeue() throws Exception{
        if (this.size() == 0)
            throw new Exception("Queue is empty already!");

        int rv = this.data[0];

        for (int i = 0 ; i <this.front; i++){
            this.data[i] = this.data[i+1];
        }
        this.front--;
        return rv;
    }
    public int front() throws Exception{
        if (this.size()==0){
            throw new Exception("Queue is empty");
        }
        return this.data[0];
    }

    public void display(){
        for (int i = 0; i<=this.front; i++){
            System.out.print(this.data[i]+" ");
        }
        System.out.println("End!");
    }

}
