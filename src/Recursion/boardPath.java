package Recursion;

import java.util.ArrayList;

public class boardPath {
    public static void main(String[] args) {

        System.out.println(getBoardPath(0, 10));

    }

    public static ArrayList<String> getBoardPath(int curr, int end){
        if (curr == end){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        if (curr > end){
            ArrayList<String> br = new ArrayList<>();
            return br;
        }
        ArrayList<String> mr = new ArrayList<>();

        for (int dice = 1; dice < 7; dice++){
            ArrayList<String> rr = getBoardPath(curr+dice, end);

            for (String rrs: rr){
                mr.add(dice + rrs);
            }
        }

        return mr;


    }
}
