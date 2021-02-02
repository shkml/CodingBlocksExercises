package Recursion;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        String s = "abc";

        ArrayList<String> res = permutation(s);
        System.out.println(res);
    }

    public static ArrayList<String> permutation(String str){
        if (str.length()==0){
            ArrayList<String> blank = new ArrayList<>();
            blank.add("");
            return blank;
        }

        char ch = str.charAt(0); // First character
        String ros = str.substring(1); // rest of string
        ArrayList<String> rr = permutation(ros);
        ArrayList<String> mr = new ArrayList<>();

        // iterating over the result and adding the character
        for (String s: rr)
            for(int j = 0; j <=s.length(); j++){
                String val = s.substring(0,j)+ch+s.substring(j);
                mr.add(val);
            }
        return mr;
    }
}
