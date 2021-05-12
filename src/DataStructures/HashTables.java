package DataStructures;
import java.util.*;
public class HashTables {

    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("Komal", 26);

        Object ht2 = ht.clone();
        System.out.println(ht2.toString());

    }
}
