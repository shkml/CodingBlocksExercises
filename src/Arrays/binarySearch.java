package Arrays;

public class binarySearch {

    public static void main(String[] args){
        int[] arr = {1,3,5,7,9,11,13,15,17,19,21};

        for (int i =1; i <22; i+=2) {
            int val = binarysrch(arr, i);
            System.out.println("Element is found at index: " + val);
        }
    }

    public static int binarysrch(int[] arr, int data){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = (start+end)/2;
            if (arr[mid] == data)
                return mid;

            else if (arr[mid] > data)
                end = mid-1;

            else
                start = mid+1;
        }
        return -1;
    }
}
