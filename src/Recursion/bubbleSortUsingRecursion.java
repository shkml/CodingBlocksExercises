package Recursion;

public class bubbleSortUsingRecursion {
    public static void main(String[] args){
        int[] arr = {90,30,50,170,10,110,3,80,70,10,40};

        bubbleSrtRecursion(arr, 0, arr.length-1);

        for (int val : arr){
            System.out.print(val+ " ");
        }
    }

    public static void bubbleSrtRecursion(int[] arr, int low, int high){
        if (high == 0)
            return;

        if(low == high){
            bubbleSrtRecursion(arr, 0, high-1);
            return;
        }
        if(arr[low]>arr[low+1]){
            int temp = arr[low];
            arr[low] = arr[low+1];
            arr[low+1] = temp;
        }
        bubbleSrtRecursion(arr, low+1, high);
    }
}
