package Recursion;

public class allIndices {
    public static void main(String[] args) {
        int[] arr = {3,8,1,8,8,4};

        int[] result = findIndex(arr,0, 8, 0);
        for (int val : result)
            System.out.print(val +" ");
    }

    public static int[] findIndex(int[] arr, int index, int data, int count){
        if (index == arr.length){
            int[] base = new int[count];
            return base;
         }

        int[] indices = null;
        if (arr[index] == data)
            indices = findIndex(arr, index+1, data, count+1);
        else
            indices = findIndex(arr, index+1, data, count);

        if (arr[index] == data)
            indices[count] = index;

        return indices;
    }
}
