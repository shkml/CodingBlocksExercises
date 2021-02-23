package LinkedList;

public class ClientStack {

    public static void main(String[] args) throws Exception{
        LinkedListAsStack ll = new LinkedListAsStack();

        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);

        ll.traverse();

        ll.pop();

        System.out.println("\nTop: " +ll.top());

        System.out.println("\nTraverse");
        ll.traverse();

        System.out.println("\n"+ll.isEmpty());
    }
}