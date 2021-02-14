package Problems.Backtracking;

public class TwoQueenPermutations {
    public static void main(String[] args) {
        boolean[] boxes = new boolean[4];
        QueenPermutations(boxes, 0, 2, "");
    }

    // qpsf - queens placed so far
    public static void QueenPermutations(boolean[] boxes, int qpsf, int tq, String ans){
        if (qpsf == tq){
            System.out.println(ans);
            return;
        }

        // first we want to make queen0 sit in all the places of the array
        for (int i=0; i<boxes.length; i++){
            if(boxes[i] == false) {
                boxes[i] = true;
                QueenPermutations(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i);
                boxes[i] = false;
            }
        }
    }
}
