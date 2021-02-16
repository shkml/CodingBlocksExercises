package Problems;

public class randomTry {

    public static void main(String[] args) {

        // declare an array
        int[] arr = new int[100];

        for (int i =0; i< arr.length; i++)
            arr[i] = (int)(Math.random()*100);

        for(int val: arr)
            System.out.print(val+" ");
    }
}
