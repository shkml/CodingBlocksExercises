package Problems;// In this problem we are given an array containing 0,1,2 and we have to sort it.

 class DutchNationalFlag {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 0, 2, 1, 0, 2, 1};
        int low = 0, mid = 0, high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                // swap low and mid
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid+=1;
                low+=1;
            }

            else if (arr[mid] == 1)
                mid+=1;

            else {
                // swap mid and high
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high-=1;
            }
        }

        for (int val: arr)
            System.out.print(val+" ");
    }
}
