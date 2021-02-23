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

    // O(n)
    public void traverse() {
        // ensures that class's data member is getting access
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // add an element to the end of the list
    public void addLast(int val) {
        Node nn = new Node();
        nn.data = val;
        nn.next = null;

        // attach
        if (this.size >= 1)
            this.tail.next = nn;

        // summary objects
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size += 1;
        } else {
            this.tail = nn;
            this.size += 1;
        }
    }

    // O(1)
    public void addFirst(int val) {
        Node nn = new Node();
        nn.data = val;
        nn.next = null;

        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size += 1;
        } else {
            Node newNode = this.head;
            this.head = nn;
            this.head.next = newNode;
            this.size += 1;
        }
    }

    // O(1)
    public int getFirst() throws Exception {
        if (this.size == 0)
            throw new Exception("Linked List is Empty!");
        return this.head.data;
    }

    // O(1)
    public int getLast() throws Exception {
        if (this.size == 0)
            throw new Exception("Linked List is Empty!");
        return this.tail.data;
    }

    // O(n)
    public int getAt(int index) throws Exception {
        if (this.size == 0)
            throw new Exception("Linked List is Empty!");
        if (index < 0 || index > this.size)
            throw new Exception("Index is greater than size of the list!");

        int n = 0;
        Node temp = this.head;
        while (n != index) {
            temp = temp.next;
            n += 1;
        }
        return temp.data;
    }

    // private so that client class do not have the authority to manipulate the node.
    private Node getNodeAt(int index) throws Exception {
        if (this.size == 0)
            throw new Exception("Linked List is Empty!");
        if (index < 0 || index > this.size)
            throw new Exception("Index is greater than size of the list!");

        int n = 0;
        Node temp = this.head;
        while (n != index) {
            temp = temp.next;
            n += 1;
        }
        return temp;
    }

    // O(n)
    public void addNodeAt(int index, int val) throws Exception {
        if (this.size == 0 && index > 0)
            throw new Exception("Linked List is Empty!");

        if (index < 0 || index > this.size)
            throw new Exception("Index is greater than size of the list!");

        int count = 0;
        Node temp = this.head;

        Node nn = new Node();
        nn.data = val;
        nn.next = null;

        while (count != index - 1) {
            temp = temp.next;
            count += 1;
        }

        Node rest = temp.next;
        temp.next = nn;
        nn.next = rest;
        this.size += 1;
        return;
    }

    // O(1)
    public void removeFirst() throws Exception {
        if (this.size == 0)
            throw new Exception("Linked list is empty");

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size -= 1;
        } else {
            this.head = this.head.next;
            this.size -= 1;
        }

        return;
    }

    // O(n)
    public void removeLast() throws Exception {
        if (this.size == 0)
            throw new Exception("Linked list is empty");
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size -= 1;
        } else {
            Node temp = this.head;
            while (temp.next != this.tail) {
                temp = temp.next;
            }
            this.tail = temp;
            temp.next = null;
            this.size -= 1;
        }
        return;
    }

    public void removeAt(int index) throws Exception {
        if (this.size == 0)
            throw new Exception("Linked list is empty");

        if (index >= this.size || index < 0)
            throw new Exception("Index is Invalid");

        if (index == 0)
            removeFirst();

        else if (index == this.size - 1)
            removeLast();

        else {
            int count = 0;
            Node temp = this.head;

            while (count != index - 1) {
                temp = temp.next;
                count += 1;
            }
            Node val = temp.next;

            if (val.next != null) {
                Node rem = val.next;
                temp.next = rem;
            } else
                temp.next = null;

            this.size -= 1;
        }
        return;
    }

    public int getSize() {
        return this.size;
    }

    // Reverse Data
    public void reverseData() throws Exception {
        int left = 0;
        int right = this.size - 1;

        while (left < right) {
            Node le = getNodeAt(left);
            Node ri = getNodeAt(right);

            int temp = ri.data;
            ri.data = le.data;
            le.data = temp;

            left += 1;
            right -= 1;
        }

        return;
    }

    // Reverse Pointers
    public void reversePointers() {

        Node prev = this.head;
        Node current = prev.next;
        Node ahead;

        while (current != null) {
            ahead = current.next;
            current.next = prev;
            prev = current;
            current = ahead;
        }
        Node t = this.head;
        this.head = this.tail;
        this.tail = t;
        this.tail.next = null;
    }

    // mid point of Linked list - cannot use size variable
    public int midPoint() throws Exception {
        /*Node midNode = getNodeAt(this.size/2);
        return midNode.data ;*/

        Node single = this.head;
        Node doub = this.head;

        while(doub.next!=null && doub.next.next!=null){
            single = single.next;
            doub = doub.next.next;
        }
        return single.data;
    }
}
