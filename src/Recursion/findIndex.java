package Recursion;

import java.util.Scanner;

public class findIndex {
    public static void main(String[] args) {
        int[] arr = {6,8,1,1,8,3,4};

        System.out.print("Enter value to be find: ");
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        System.out.println(findFirst(arr, 0, val));
        System.out.println(findLast(arr, 0, val));
    }

    public static int findFirst(int[] arr, int index, int data){
        if (index == arr.length)
            return -1;

        if (arr[index] == data)
            return index;

        return findFirst(arr, index+1, data);
    }

    // Iterate from first index only instead of last
    public static int findLast(int[] arr, int index, int data){
        if (index == arr.length)
            return -1;

        int idx = findFirst(arr, index+1, data);
        if (idx == -1){
            if (arr[idx]==data){
                return idx;
            }
            else {
                return -1;
            }
        }
        return idx;
    }
}
