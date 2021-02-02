package Arrays;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args){
        // Creating an array list
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);
        System.out.println(list.size());

        // Adding the element.
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        // removing an element
        list.remove(3);

        // Array List grows on its own and double the size when a new element is added
        // when size is 2^n

        // Size of the array
        System.out.println(list.size());
        System.out.println(list);

        System.out.println(list.get(1)); // 20
        System.out.println(list.get(4)); // 50

        // System.out.println(list.get(6)); // index out of bound
    }
}
