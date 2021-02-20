package LinkedList;

public class LinkedList {

    // So that no other class can create an instance of same
    private class Node {
        int data;
        Node next;
    }

    /*Node n = new Node();*/
    private Node head;
    private Node tail;
    private int size;

    public void traverse(){
        // ensures that class's data member is getting access
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    // add an element to the end of the list
    public void addLast(int val){
        Node nn = new Node();
        nn.data = val;
        nn.next = null;

        // attach
        if (this.size>=1)
            this.tail.next = nn;

        // summary objects
        if (this.size == 0){
            this.head = nn;
            this.tail = nn;
            this.size +=1;
        } else {
            this.tail = nn;
            this.size+=1;
        }
    }

    public void addFirst(int val){
        Node nn = new Node();
        nn.data = val;
        nn.next = null;

        if (this.size == 0){
            this.head = nn;
            this.tail = nn;
            this.size+=1;
        } else {
            Node newNode = this.head;
            this.head = nn;
            this.head.next = newNode;
            this.size+=1;
        }
    }

    public int getFirst() throws Exception{
        if (this.size == 0)
            throw new Exception("Linked List is Empty!");
        return this.head.data;
    }

    public int getLast() throws Exception{
        if (this.size == 0)
            throw new Exception("Linked List is Empty!");
        return this.tail.data;
    }

    public int getAt(int index) throws Exception{
        if (this.size == 0)
            throw new Exception("Linked List is Empty!");
        if (index < 0 ||index > this.size)
            throw new Exception("Index is greater than size of the list!");

        int n = 0;
        Node temp = this.head;
        while (n!=index){
            temp = temp.next;
            n+=1;
        }
        return temp.data;
    }

    // private so that client class do not have the authority to manipulate the node.
    private Node getNodeAt(int index) throws Exception{
        if (this.size == 0)
            throw new Exception("Linked List is Empty!");
        if (index < 0 ||index > this.size)
            throw new Exception("Index is greater than size of the list!");

        int n = 0;
        Node temp = this.head;
        while (n!=index){
            temp = temp.next;
            n+=1;
        }
        return temp;
    }

    // O(n)
    public void addNodeAt(int index, int val) throws Exception{
        if (this.size == 0 && index >0)
            throw new Exception("Linked List is Empty!");

        if (index < 0 ||index > this.size)
            throw new Exception("Index is greater than size of the list!");

        int count = 0;
        Node temp = this.head;

        Node nn = new Node();
        nn.data = val;
        nn.next = null;

        while(count!=index-1){
            temp = temp.next;
            count+=1;
        }

        Node rest = temp.next;
        temp.next = nn;
        nn.next = rest;
    }

    // O(1)
    public void removeFirst() throws Exception{
        if (this.size == 0)
            throw new Exception("Linked list is empty");

        if (this.size == 1){
            this.head = null;
            this.tail = null;
            this.size-=1;
        } else {
            this.head = this.head.next;
            this.size-=1;
        }

        return;
    }

    // O(n)
    public void removeLast() throws Exception{
        if (this.size == 0)
            throw new Exception("Linked list is empty");
        if (this.size == 1){
            this.head = null;
            this.tail = null;
            this.size-=1;
        } else {
            Node temp = this.head;
            while(temp.next!=this.tail) {
                temp = temp.next;
                this.size -= 1;
            }
            this.tail = temp;
            temp.next = null;
            this.size-=1;
        }
        return;
    }
}

