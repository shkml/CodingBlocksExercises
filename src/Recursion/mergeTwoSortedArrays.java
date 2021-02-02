package Recursion;

public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arrA = {0,14,34,43,43,76,84,85};
        int[] arrB = {1,2,3,45,67};
        int[] arr = new int[arrA.length+ arrB.length];
        int i = 0,j = 0, start= 0;


        while(i< arrA.length && j<arrB.length){
            if (arrA[i] < arrB[j]) {
                arr[start] = arrA[i];
                i+=1;
                start+=1;
            }

            else {
                arr[start] = arrB[j];
                j+=1;
                start+=1;
            }

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

        for(int val: arr)
            System.out.print(val+ " ");
    }
}
