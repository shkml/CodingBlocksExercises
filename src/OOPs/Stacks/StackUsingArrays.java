// All methods of stack works on O(1) time but the display, since display depends on the size

// Application - Browser - when we use back and forward button
package OOPs.Stacks;

public class StackUsingArrays {
    protected int[] data;
    protected int top;

    public static final int DAFAULTCAPACITY =10;
    public StackUsingArrays() throws Exception{
        this(DAFAULTCAPACITY);
    }

    public StackUsingArrays(int capacity) throws Exception{
        if (capacity < 1)
            throw new Exception("Invalid capacity");

        this.data = new int[capacity];
        this.top = -1;
    }

    public int size(){
        return this.top+1;
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    public void push(int value) throws Exception{
        if (this.size()==this.data.length)
            throw new Exception("Stack is full");

        this.top++;
        this.data[this.top] = value;
    }

    public int pop() throws Exception{
        if (this.size() == 0)
            throw new Exception("Stack is empty already!");

        int rv = this.data[this.top];
        this.data[this.top] = 0 ;
        this.top--;
        return rv;
    }

    public int top() throws Exception{
        if (this.size()==0){
            throw new Exception("Stack is empty");
        }
        return this.data[this.top];
    }

    public void display(){
        for (int i =this.top; i>=0; i--){
            System.out.print(this.data[i]+" ");
        }
        System.out.println("End!");
    }
}
