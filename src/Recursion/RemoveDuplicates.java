package Recursion;

import java.util.Scanner;

/*
 Take as input S, a string. Write a function that removes all consecutive duplicates. Print the value returned.
 Input - aabccba
 Output - abcba
*/
public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next();
        input.close();
        System.out.println(rmvDupl(S, S.substring(0,1), 0));
    }

    public static String rmvDupl(String S, String newString, int index){
        if (index == S.length())
            return newString;

        if (newString.charAt(newString.length()-1) == S.charAt(index))
            return rmvDupl(S, newString, index+1);
        else{
            newString = newString + S.charAt(index);
            return rmvDupl(S, newString, index+1);
        }
    }
}
