package Arrays;

public class lowerAndUpperBound {
    public static void main(String[] args){

        int[] arr = {1,2,2,2,3,4,4,5,5,5,5,7};

        // Lower bound
        System.out.println(lowerBound(arr, 4));

        // Upper bound
        System.out.println(upperBound(arr, 4));
    }

    public static int lowerBound(int[] arr, int data){
        int start = 0;
        int end = arr.length-1;
        int val = -1;
        while (start<=end){
            int mid = (start+end)/2;
            if (arr[mid] == data){
                val = mid;
                end = mid-1;
            }
            else if (arr[mid]>data)
                end = mid-1;
            else
                start = mid+1;
        }
        return val;
    }

    public static int upperBound(int[] arr, int data){
        int start = 0;
        int end = arr.length-1;
        int val = -1;
        while (start<=end){
            int mid = (start+end)/2;
            if (arr[mid] == data){
                val = mid;
                start = mid+1;
            }
            else if (arr[mid]>data)
                end = mid-1;
            else
                start = mid+1;
        }
        return val;
    }
}
