package Recursion;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("\nEnter the power: ");
        int power = input.nextInt();

        System.out.println(powerCalculate(number, power));
    }

    public static int powerCalculate(int n, int p){
        if (p == 1)
            return n;

        int result = n*powerCalculate(n, p-1);

        return result;
    }
}
