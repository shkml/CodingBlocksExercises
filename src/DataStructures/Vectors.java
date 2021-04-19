package DataStructures;

import java.util.*;

class Vectors {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < 22; i++) {
            vec.add((i + 1) * 10);
            al.add((i + 1) * 10);
        }

        vec.remove(5);
        al.remove(5);

        // Size of vectors gets doubles
        System.out.println("Vectory Capacity: " + vec + " " + vec.capacity());
        System.out.println("ArrayList Capacity: " + al + " " + al.size());

    }
}
