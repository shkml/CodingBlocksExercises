package Recursion;

/* Take as input N, the size of an integer array. Take one more input, which is a list of N integers
separated by a space, and store that in an array. Write a recursive function which prints true if
the array is sorted, and false otherwise.
 * */

import java.util.Scanner;

public class Sorted {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int N = input.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            System.out.print("Enter " + (i + 1) + " term ");
            arr[i] = input.nextInt();
        }

        input.close();
        System.out.println(Sorted(arr, 0, 1));
    }

    public static boolean Sorted(int[] arr, int start, int startNext){
        if (startNext == arr.length)
            return true;

        if (arr[start] <= arr[startNext])
            return Sorted(arr, start+1, startNext+1);

        else
            return false;

    }
}
