package Problems.Backtracking;

public class CoinChangeCombination {
    public static void main(String[] args) {
        int[] denom = {2, 3, 5, 6};
        CoinChange(denom, 10, "", 0);
    }

     public static void CoinChange(int[] denmon, int amount, String ans, int lastDenominationIndex){
        if (amount == 0) {
            System.out.println(ans);
            return;
        }

        for(int i = lastDenominationIndex; i<denmon.length;i++){

            if (amount >= denmon[i]){
                CoinChange(denmon, amount - denmon[i], ans+denmon[i], i);
            }
        }
     }
}
