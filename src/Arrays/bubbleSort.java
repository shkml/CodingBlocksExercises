package Arrays;// Complexity of O(n^2)

public class bubbleSort {
    public static void main(String[] args){
        int[] arr = {19,3,54,17,19,11,133,115,7,1,4};

        bubbleSrt(arr);

        for (int val : arr){
            System.out.println(val);
        }
    }

    // taking the element, comparing it to all the elements in right side and move the greatest in right
    public static void bubbleSrt(int[] arr){
        for(int counter = 0; counter <arr.length-1; counter++){
            for (int j=0; j<arr.length-1-counter; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


}
