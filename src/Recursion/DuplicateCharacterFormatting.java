package Recursion;

/*
* Take as input str, a string. Write a recursive function which returns a new string in which all duplicate
* consecutive characters are separated by a ‘ * ’. E.g. for “hello” return “hel*lo”. Print the value returned
*/

import java.util.Scanner;

public class DuplicateCharacterFormatting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.next();

        System.out.println(characterFormat(str,"",0, 1 ,str.length()));

        input.close();
    }

    public static String characterFormat(String str, String newString, int start, int end, int length) {

        if (end == length){
            newString += str.charAt(start);
            return newString;
        }

        if (str.charAt(start) == str.charAt(end)) {
            newString = newString + str.charAt(start) + "*";
            return characterFormat(str, newString, start+1, end+1, length);
        }

        else {
            newString = newString + str.charAt(start);
            return characterFormat(str, newString, start+1, end+1, length);
        }
    }
}
