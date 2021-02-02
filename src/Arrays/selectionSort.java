package Arrays;// Complexity of O(n^2)

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {19,3,54,17,19,11,133,115,7,1,4};

        selectionSrt(arr);

        for (int val : arr){
            System.out.println(val);
        }
    }

//    Find the min elem and place it at first.
//    Ignore first now , find second min from rest of the arr, when found swap.
    public static void selectionSrt(int[] arr){
        for (int counter = 0; counter<arr.length-1; counter++){
            int minElem = counter;
            for (int j = counter+1; j<arr.length; j++){
                if (arr[j] < arr[minElem])
                    minElem = j;
            }

            int temp = arr[minElem];
            arr[minElem] = arr[counter];
            arr[counter] = temp;
        }
    }
}
