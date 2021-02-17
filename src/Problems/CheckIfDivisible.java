package Problems;

import java.util.ArrayList;

// In this problem we are testing whether a number is divisible by how many elements in a digit
public class CheckIfDivisible {

    public static void main(String[] args) {
        // Enter a number here
        int n = 1422;
        int count = 0;
        ArrayList<Integer> arr = new ArrayList();

        int duplicateN = n;
        while(n>0){
            arr.add(n%10);
            n = n/10;
        }

        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i)!=0 && duplicateN%arr.get(i) == 0)
                count+=1;
        }
        System.out.println(count);
    }
}
