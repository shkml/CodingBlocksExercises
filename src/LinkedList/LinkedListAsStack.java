package LinkedList;

public class LinkedListAsStack {

    private LinkedList stack;

    public LinkedListAsStack(){
        this.stack = new LinkedList();
    }

    public int size(){
        return this.stack.getSize();
    }

    public void traverse(){
        this.stack.traverse();
    }

    public void push(int val){
        this.stack.addFirst(val);
    }

    public void pop() throws Exception{
        this.stack.removeFirst();
    }

    public int top() throws Exception{
        return this.stack.getFirst();
    }

    public boolean isEmpty(){
        return this.stack.getSize() == 0;
    }
}
