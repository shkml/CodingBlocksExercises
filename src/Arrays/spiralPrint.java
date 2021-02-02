package Arrays;

import java.util.Scanner;

public class spiralPrint {
    public static void main(String[] args){
        int[][] arr = takeInput();

    }

    public static int[][] takeInput(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter number of cols: ");
        int columns = input.nextInt();

        int[][] arr = new int[rows][columns];

        System.out.println("Enter the values: ");

        for(int i=0; i<rows; i++)
            for (int j = 0; j< columns; j++){
                arr[i][j] = input.nextInt();
            }

        return arr;
    }
}
