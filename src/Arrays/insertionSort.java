//Works on the logic when we have already sorted array and we want to merge the new element.
package Arrays;

public class insertionSort {
    public static void main(String[] args){
        int[] arr = {30, 50, 10, 80, 40, 20};
        insertionSrt(arr);
        for(int val: arr)
            System.out.print(val+" ");
    }

    /* Select counter from 1 and once it is selected keep going to the left (j)
    until you satisfy condition. */
    public static void insertionSrt(int[] arr){
        for(int counter = 1; counter<arr.length; counter++){
            int val = arr[counter];
            int j = counter-1;
            while(j>=0 && arr[j]>val){
                arr[j+1] = arr[j];
                j-=1;
            }
            arr[j+1] = val;
        }
    }
}
