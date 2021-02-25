package OOPs.Stacks;

public class reverseAQueue {

    public static void main(String[] args) throws Exception {

        DynamicQueue Q = new DynamicQueue(10);

        Q.enqueue(10);
        Q.enqueue(20);
        Q.enqueue(30);
        Q.enqueue(40);
        Q.enqueue(50);
        Q.enqueue(60);

        reverseQueue(Q);

        Q.display();
    }

    public static void reverseQueue(DynamicQueue Q) throws Exception{
        if (Q.isEmpty())
            return;

        int element = Q.dequeue();
        reverseQueue(Q);
        Q.enqueue(element);
    }
}
