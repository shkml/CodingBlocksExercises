package Recursion.printRecursions;

import javax.print.attribute.standard.PresentationDirection;

public class printSubsequences {
    public static void main(String[] args) {
        printSS("abc", "");
    }

    public static void printSS(String str, String empty) {
        if (str.length() == 0){
            System.out.print(empty+" ");
            return;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        printSS(ros, empty);
        printSS(ros, empty+cc);
    }
}
