package LinkedList;

public class Client {

    public static void main(String[] args) throws Exception {

        LinkedList l = new LinkedList();
        /*System.out.println(l.getAt(2));
        System.out.println(l.getLast());
        System.out.println(l.getFirst());*/
        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        l.addLast(40);
//        l.traverse();

        l.addFirst(5);l.traverse();

        System.out.println();
        System.out.println(l.getFirst()); // 5
        System.out.println(l.getLast()); // 40

        System.out.println(l.getAt(2)); // 20
        System.out.println(l.getAt(4)); // 40
        System.out.println(l.getAt(0)); // 5

        l.traverse();
        System.out.print("\nAdd value at index: ");
        l.addNodeAt(3,25);
        l.traverse();

        System.out.print("\nRemove first: ");
        l.removeFirst();
        l.traverse();

        System.out.print("\nRemove Last: ");
        l.removeLast();
        l.traverse();

        System.out.println("\nSize: "+ l.getSize());

        System.out.print("\nRemove at: ");
        l.removeAt(2);
        l.traverse();

        System.out.print("\nReverse data: ");
        l.reverseData();
        l.traverse();

        System.out.print("\nReverse Pointers: ");
        l.reversePointers();
        l.traverse();

        System.out.println("\nAdding elements");
        l.addFirst(5);
        //l.addNodeAt(2,15);
        //l.addNodeAt(4, 25);
        l.traverse();

        System.out.println("\nMid element: "+l.midPoint());

    }

}
