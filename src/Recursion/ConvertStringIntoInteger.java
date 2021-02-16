package Recursion;

import java.util.Scanner;

/* Take as input str, a number in form of a string. Write a recursive function to convert the number in
string form to number in integer form. E.g. for “1234” return 1234. Print the value returned.
 */
public class ConvertStringIntoInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String number = input.next();
        System.out.println(stringToInteger(number, 0, number.length()-1, 0));

        input.close();
    }

    public static int stringToInteger(String number, int value, int index, int digit){
        if (index == -1)
            return value;

        int valueAtIndex = number.charAt(index) - '0';
        value = ((int)(Math.pow(10, digit)) * valueAtIndex) + value;
        return stringToInteger(number, value, index-1, digit+1);
    }
}
