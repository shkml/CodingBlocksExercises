package Recursion;

public class checkIfSorted {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0};

        System.out.println(isSorted(arr, 0));
    }

    public static boolean isSorted(int[] arr, int index){
        if (index == arr.length-1)
            return true;

        if (arr[index] > arr[index+1])
            return false;
        else
            return isSorted(arr, index+1);
    }
}
