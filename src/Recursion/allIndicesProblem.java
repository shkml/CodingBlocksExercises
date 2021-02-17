package Recursion;

/*Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number.
Write a recursive function which returns an array containing indices of all items in the array which have
value equal to M. Print all the values in the returned array.

Input Format - Enter a number N(size of the array) and add N more numbers to the array Enter number M to
be searched in the array.

Sample Input - 5
3 2 1 2 3
2
Sample Output -
1 3

Display all the indices at which number M is found in a space separated manner
*/

import java.util.ArrayList;
import java.util.Scanner;

public class allIndicesProblem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Number of elements in an array
        int N = input.nextInt();
        int[] arr = new int[N];

        // assigning values to array
        for (int i=0; i<N; i++) {
            System.out.print("Enter " + (i + 1) + " term ");
            arr[i] = input.nextInt();
        }

        // entering the value of number to be searched
        int M = input.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        result = indicesProblem(arr, result, M, 0);

        for (int i=0; i<result.size(); i++)
            System.out.print(result.get(i)+" ");
        input.close();
    }

    public static ArrayList<Integer> indicesProblem(int[] arr, ArrayList<Integer> resultantArray, int M, int index){
        if (index == arr.length)
            return resultantArray;

        if (arr[index] == M){
            resultantArray.add(index);
            return indicesProblem(arr, resultantArray, M, index+1);
        }

        else {
            return indicesProblem(arr, resultantArray, M, index+1);
        }
    }
}
