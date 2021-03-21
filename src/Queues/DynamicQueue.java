package Queues;

public class DynamicQueue extends QueueUsingArrays{

    public DynamicQueue() throws Exception{
        this(DAFAULT_CAPACITY);
    }

    public DynamicQueue(int capacity) throws Exception{
        super(capacity);
    }

    public void push(int value) throws Exception{
        if (this.size()==this.data.length){
            int[] arr = new int[2*this.data.length];
            for (int i=0; i<this.size(); i++)
                arr[i] = this.data[i];
            this.data = arr;
        }
        super.enqueue(value);
    }
}
