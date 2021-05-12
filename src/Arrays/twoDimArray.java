package Arrays;

import java.util.Scanner;

public class twoDimArray {
    public static void main(String[] args) {

        // Initialize an array

        int[][] twoDimArray = new int[2][3];
        int rows = twoDimArray.length;
        int cols = twoDimArray[0].length;

        System.out.println("rows: " + rows + " and Cols: " + cols);

        int[][] arr = takeInput();

        display(arr);
    }

    public static int[][] takeInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter number of cols: ");
        int columns = input.nextInt();

        int[][] arr = new int[rows][columns];

        System.out.println("Enter the values: ");

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) {
                arr[i][j] = input.nextInt();
            }

        return arr;
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

}
