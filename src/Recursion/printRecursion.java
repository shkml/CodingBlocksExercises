package Recursion;

import java.util.Scanner;

public class printRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = input.nextInt();

//        decreasingPrint(n);
//        increasingPrint(n);
        pdiSkip(n);
    }

    public static void decreasingPrint(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        decreasingPrint(n-1);
        System.out.println(n);
    }

    public static void increasingPrint(int n) {
        if (n == 0)
            return;
        increasingPrint(n-1);
        System.out.println(n);
    }

    public static void pdiSkip(int n) {
        if (n==0)
            return;
        if (n%2!=0)
            System.out.println(n);
        pdiSkip(n-1);
        if (n%2==0)
            System.out.println(n);
    }
}
