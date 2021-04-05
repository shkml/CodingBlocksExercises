package Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumElementInKWindows {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;

        int[] res = maxElemWindows(array, k);

        for (int val : res)
            System.out.print(val + " ");
    }

    public static void naiveApproach(int[] array, int k) {
        int[] result = new int[array.length - k + 1];
        int index = 0; // Naive
        for (int i = 0; i < array.length - k + 1; i++) {
            int maxElem = array[i];
            for (int j = i; j < i + k; j++) {
                if (array[j] > maxElem) {
                    maxElem = array[j];
                }
            }
            result[index] = maxElem;
            index += 1;
        }
        for (int val : result)
            System.out.print(val + " ");
    }

    public static int[] maxElemWindows(int[] arr, int k) {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        int[] result = new int[arr.length - k + 1];

        // getting the index of maximum element and placing the same in deque
        for (int i = 0; i < k; i++) {
            if (dq.isEmpty()) {
                dq.add(i);
            } else {
                while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
                    dq.removeLast();
                dq.addLast(i);
            }
        }

        for (int j = k; j < arr.length; j++) {
            // System.out.println(dq.peek()); Peek is the last element
            result[j - k] = arr[dq.peek()];
            while (!dq.isEmpty() && dq.peek() <= j - k)
                dq.removeFirst();

            while (!dq.isEmpty() && arr[j] >= arr[dq.peekLast()])
                dq.removeLast();

            dq.addLast(j);
        }

        result[arr.length - k] = arr[dq.peek()];
        return result;
    }
}
