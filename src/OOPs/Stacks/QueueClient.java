package OOPs.Stacks;

public class QueueClient {

    public static void main(String[] args) throws Exception {

        QueueUsingArrays Q = new QueueUsingArrays(10);

        Q.enqueue(10);
        Q.enqueue(20);
        Q.enqueue(30);
        Q.enqueue(40);
        Q.enqueue(50);
        Q.enqueue(60);

        System.out.println("Display Queue: ");
        Q.display();

        System.out.print("\nDequeuing: ");
        System.out.println(Q.dequeue());

        System.out.println("\nDisplay Queue: ");
        Q.display();

        System.out.println("\nSize: "+Q.size());

        System.out.println("\nFront element: "+ Q.front());
    }
}
