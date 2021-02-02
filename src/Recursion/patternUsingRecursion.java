package Recursion;

import java.util.Scanner;

public class patternUsingRecursion {
    public static void main(String[] args) {
        System.out.print("Enter value of n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        createPattern(n, 1, 1);
        input.close();
    }

    public static void createPattern(int n, int row, int col){
        if (col == n+1)
            return;
        for (int i = 0; i < col; i++)
            System.out.print("*");
        System.out.println();
        createPattern(n, row, col+1);
    }
}
