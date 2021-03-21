package Problems;

import java.util.Scanner;

public class printTrianglePattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many lines do you want to print in a triangle shape? ");
        int lines = input.nextInt();
        int value = 1;
        for (int i = 1; i <= lines; i++){
            int[] arr = new int[i];
            for(int j =0; j < arr.length; j++) {
                arr[j] = value;
                value += 1;
            }

            for (int val : arr)
                System.out.print(val);
            System.out.println();
        }
    }
}
