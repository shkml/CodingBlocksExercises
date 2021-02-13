package Problems;

import java.util.Scanner;

// Complexity N * Log log (n)
public class SieveofEratosthenes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the last value upto which you want to find prime no: ");
        int n = input.nextInt();
        boolean[] arr = new boolean[n+1];

        for (int i=0; i<arr.length; i++)
            arr[i] = true;

        int limit = (int)(Math.sqrt(n));
        for (int val = 2; val<= limit; val++){
            int table = 2;
            int j = table*val;
            while(j<=n && arr[val]){
                System.out.println(val);
                arr[j] = false;
                table+=1;
                j = table * val;
            }
        }

        for (int idx = 2; idx<=n; idx++){
            if (arr[idx])
                System.out.print(idx+" ");
        }

        input.close();
    }
}
