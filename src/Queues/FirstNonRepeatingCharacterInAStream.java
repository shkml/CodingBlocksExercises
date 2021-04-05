package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Queue;

public class FirstNonRepeatingCharacterInAStream {

    public static void main(String[] args) {

        String str = "cbabcadbdefgh";
        System.out.println("Brute Force Approach: "+bruteForceApproach(str));
        System.out.println("Using Queues: "+ firstNonRepeatingUsingQueue(str));
    }

    /* Do the brute force approach first - O(n^2) complexity
    * What we are trying to do here is string the occurrences in a hash map and putting the same in a
    * string builder, iterating over the string builder and checking the occurrences of the character
    * in the hashmap, the very first character found to be having the value 1, is the
    * first non repeating character.
    * */
    public static char bruteForceApproach(String str){
        // HashMap
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        StringBuilder sb = new StringBuilder();
        char nonRepeatingCharacter = '0';
        for(int i = 0; i< str.length(); i++) {
            char c = str.charAt(i);
            int j;
            sb.append(c);
            if (hm.containsKey(c))
                hm.put(c, hm.get(c) + 1);
            else
                hm.put(c, 1);
            for (j=0; j < sb.length(); j++){
                char newC = sb.charAt(j);
                if(hm.get(newC) == 1){
                    nonRepeatingCharacter = newC;
                    break;
                }
            }
            if (j == sb.length())
                nonRepeatingCharacter = '0';
        }

        return nonRepeatingCharacter;
    }

    /*Using better complexity using Queue O(n) complexity
    * Here, we are using Deque,
    * We are iterating over the string and storing the same in the queue,
    * further, calculating of the occurrence of that character in the hashmap,
    * and iterating over the queue, the first element found to be having the occurrence as 1,
    * else, removing the same from the queue.   */
    public static char firstNonRepeatingUsingQueue(String str){
        Deque<Character> queue = new ArrayDeque<Character>();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        char nonRepeatingElement = '0';
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            queue.addLast(c);
            if(hm.containsKey(c))
                hm.put(c, hm.get(c)+1);
            else
                hm.put(c, 1);
            while(!queue.isEmpty()){
                char ch = queue.getFirst();
                if(hm.get(ch)>1)
                    queue.pollFirst();
                else {
                    nonRepeatingElement = ch;
                    break;
                }
            }
            if (queue.isEmpty())
                nonRepeatingElement = '0';
        }
        return nonRepeatingElement;
    }
}
