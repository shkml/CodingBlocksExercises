package DataStructures;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        // Declare a Hash Map
        HashMap<String, Integer> hashmap = new HashMap<>();

        // to add an element
        hashmap.put("Apple", 26);
        hashmap.put("Orange", 28);
        hashmap.put("Banana", 32);
        hashmap.put("Test", 34);

        System.out.println(hashmap);
        // to delete an element
        hashmap.remove("Test");
        System.out.println(hashmap);

        // To get the value of a Key
        System.out.println(hashmap.get("Banana"));

        // Update the value of a key i.e., incresing by 20
        hashmap.put("Apple", hashmap.get("Apple") + 20);

        // Check if a Key is present
        System.out.println("hashmap.containsKey(None): " + hashmap.containsKey("None"));
        System.out.println("hashmap.containsKey(Orange): " + hashmap.containsKey("Orange"));

        // Check if a value is present
        System.out.println("hashmap.containsValue(100): " + hashmap.containsValue(100));
        System.out.println("hashmap.containsValue(28): " + hashmap.containsValue(28));

        // Check all keys
        System.out.println(hashmap.keySet());

        // Iterating over the keyset
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }

        // Check all values
        System.out.println(hashmap.values());

        // Iterating over values
        for (int value : hashmap.values()) {
            System.out.println(value);
        }

        Object newMap = hashmap.clone();
        // Cloned and printed
        System.out.println(newMap.toString());

        // Find length of number of keys i.e., 3
        System.out.println(hashmap.size());
    }
}
