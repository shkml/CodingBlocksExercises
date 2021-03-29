package Problems;

import java.util.Scanner;

public class tillingProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(tillingProblemFun(n, m));
        int[] DP = new int[n+1];

        for(int i=0; i< DP.length; i++){
            DP[i] = -1;
        }
        System.out.println(tillingProblemFunDP(n, m, DP));

        System.out.println(tillingProblemFunDPBU(n, m, DP));
    }

    public static int tillingProblemFun(int n, int m){
        if (n < m)
            return 1;
        else if (n == m)
            return 2;
        else
            return tillingProblemFun(n-m ,m) + tillingProblemFun(n-1, m);
    }

    public static int tillingProblemFunDP(int n, int m, int[] DP){
        if (DP[n] != -1)
            return DP[n];
        if (n < m)
            DP[n] = 1;
        else if (n == m)
            DP[n] = 2;
        else
            DP[n] = tillingProblemFunDP(n-m ,m, DP) + tillingProblemFunDP(n-1, m, DP);
        return DP[n];
    }

    public static int tillingProblemFunDPBU(int n, int m, int[] DP){
        for (int index=1; index<=n; index++){
            if (index < m)
                DP[index] = 1;
            else if (index == m)
                DP[index] = 2;
            else
                DP[index] = DP[index-m] + DP[index-1];
        }
        return DP[n];
    }
}
