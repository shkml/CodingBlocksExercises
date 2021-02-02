package Arrays;

class swapValues{

    public static void main(String[] args){
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 10;
        arr[2] = 30;
        arr[3] = 10;
        arr[4] = 50;

        // Not capable enough to swap in the array
        swap(arr[0], arr[2]);

        // will just print original values
        for(int val: arr)
            System.out.println(val);

        swap(arr, 0, 2);
        System.out.println("After swap: "+arr[0]+", "+arr[2]);

        System.out.println("Max int: "+maxInt(arr));

        int lower = lowerBound(arr, 10);
        int upper = upperBound(arr, 10);

        System.out.println(lower +" "+ upper);
    }

    // swapping is happening in local variables
    public static void swap(int one, int two){
        int temp = one;
        one = two;
        two = temp;
    }

    public static void swap(int arr[], int i, int j){
        System.out.println("Values before swapping"+": "+arr[i]+", "+arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println("Values after swapping"+": "+arr[i]+", "+arr[j]);

    }

    public static int maxInt(int arr[]){
        int maxVal = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if (arr[i] > maxVal)
                maxVal = arr[i];
        }

        return maxVal;
    }

    public static int lowerBound(int arr[], int data){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;

        while(low<=high){
            int mid = (low+high)/2;
            if (arr[mid] == data){
                ans = mid;
                high = mid-1;
            }

            else if(arr[mid]>data)
                high = mid-1;

            else
                low = mid+1;
        }
        return ans;
    }

    public static int upperBound(int[] arr, int data){
        int low = 0, high = arr.length-1;
        int ans = -1;

        while(low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==data){
                ans = mid;
                low = mid+1;
            }

            else if (arr[mid]>data){
                high = mid-1;
            }

            else
                low =mid+1;
        }
        return ans;
    }
}