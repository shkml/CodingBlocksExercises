package Problems.Backtracking;

/* In this problem if we have something like b0b1, we will discard b1b0 */

public class TwoQueenCombinations {
    static int count = 0;
    public static void main(String[] args) {

        boolean[] boxes = new boolean[4];
        QueenCombinations(boxes, 0, 2, "", -1);
    }

    public static void QueenCombinations(boolean[] boxes, int qpsf, int tq, String ans, int lastBoxUsed){
        if (qpsf == tq){
            count++;
            System.out.println(count+". "+ans);
            return;
        }

        // first we want to make queen0 sit in all the places of the array
        for (int i=lastBoxUsed+1; i<boxes.length; i++){
            boxes[i] = true;
            QueenCombinations(boxes, qpsf + 1, tq, ans + "Q" + qpsf + "B" + i, i);
            boxes[i] = false;

        }
    }
}
