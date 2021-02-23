package LinkedList;

public class ClientQueue {

    public static void main(String[] args) throws Exception{

        LinkedListAsQueue ll = new LinkedListAsQueue();
        ll.enqueue(5);
        ll.enqueue(10);
        ll.enqueue(15);
        ll.enqueue(20);

        ll.traverse();

        System.out.println("\nGet front: "+ll.front());

        System.out.println("\nDequeuing");
        ll.dequeue();

        System.out.println("\nTraverse: ");
        ll.traverse();

        System.out.println("\nSize: "+ll.size());

        System.out.println("\nWhether Empty? ");
        System.out.println(ll.isEmpty());
    }
}
