package Recursion;

public class mergeSort {
    public static void main(String[] args) {

        int[] arr = {10,60,30,40,20,35,100,23,70};

        int[] res = mergeSortCode(arr, 0, arr.length-1);

        for(int val: res)
            System.out.print(val+ " ");
    }

    public static int[] mergeSortCode(int[] arr, int lo, int hi){
        // Base condition
        if (lo == hi){
            int[] br = new int[1];
            br[0] = arr[lo];
            return br;
        }

        int mid = (lo+hi)/2;

        int[] fh = mergeSortCode(arr, lo, mid);
        int[] sh = mergeSortCode(arr, mid+1, hi);

        return mergeTwoSortedArrays(fh, sh);
    }

    public static int[] mergeTwoSortedArrays(int[] arrA, int[] arrB) {
        int[] arr = new int[arrA.length+ arrB.length];
        int i = 0,j = 0, start= 0;

        while(i< arrA.length && j<arrB.length){
            if (arrA[i] < arrB[j]) {
                arr[start] = arrA[i];
                i+=1;
            }

            else {
                arr[start] = arrB[j];
                j+=1;
            }
            start+=1;
        }

        while (i!= arrA.length){
            arr[start] = arrA[i];
            i+=1;
            start+=1;
        }

        while (j!= arrB.length) {
            arr[start] = arrB[j];
            j+=1;
            start+=1;
        }

        return arr;
    }
}
