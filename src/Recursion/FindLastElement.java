package Recursion;

import java.util.Scanner;

/* Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number.
Write a recursive function which returns the last index at which M is found in the array and -1 if M is not
found anywhere. Print the value returned.

Input Format
There will be three lines of input:

N - the size of the array
N space separated integers that make up the array
M
* */
public class FindLastElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int N = input.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            System.out.print("Enter " + (i + 1) + " term ");
            arr[i] = input.nextInt();
        }

        int M = input.nextInt();
        input.close();
        System.out.println(findLastElement(arr, 0, -1,  M));
    }

    public static int findLastElement(int[] arr, int index, int before, int M){
        if (index == arr.length)
            return before;

        if (arr[index] == M) {
            before = index;
            return findLastElement(arr, index+1, before, M);
        }

        else
            return findLastElement(arr, index+1, before, M);
    }
}
