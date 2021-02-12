package Problems;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = input.nextInt();
        System.out.print("Enter value of n: ");
        int n = input.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if (n == 0)
            return 1;

        int val = power(x, n/2);
        // n is odd
        if (n%2 != 0)
            return val*val*x;

        // n is even
        else
            return val*val;
    }
}
