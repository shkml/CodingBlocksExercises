package Recursion;

import java.util.Scanner;

// this will replace the occurrences of pi with 3.14

public class ReplaceOccurences {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 0; i<N; i++){
            String str = input.next();
            System.out.println(replace(str, "", 0, 1));
        }
        input.close();
    }

    public static String replace(String s, String newString, int start, int end) {
        if (end == s.length()) {
            newString += s.charAt(start);
            return newString;
        }

        if ((s.charAt(start) == 'p') && (s.charAt(end) == 'i')) {
            newString += "3.14";
            return replace(s, newString, start + 2, end + 2);
        } else {
            newString += s.charAt(start);
            return replace(s, newString, end, end + 1);
        }
    }
}

