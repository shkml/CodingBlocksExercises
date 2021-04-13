package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class FirstNegativeIntegerInWindowSizeK {

    public static void main(String[] args) {
        int[] array = {12, -1, -7, 8, -15, 30, 16, 28};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of k: ");
        int k = input.nextInt();
        input.close();
        int i;
        Deque<Integer> queue = new ArrayDeque<>();
        // Putting the initial negative numbers in queue
        for (i = 0; i < k; i++){
            int val = array[i];
            if (val < 0)
                queue.addLast(i);
        }

        for (; i< array.length; i++){
            if (!queue.isEmpty())
                System.out.print(array[queue.peek()]+" ");
            else
                System.out.print(0+" ");

            while(!queue.isEmpty() && queue.peek()<=i-k)
                queue.removeFirst();

            if (array[i] < 0)
                queue.addLast(i);
        }
        
        if(!queue.isEmpty())
            System.out.print(array[queue.peek()]+ " ");
        else
            System.out.print("0");
    }
}
