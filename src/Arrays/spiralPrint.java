package Arrays;

import java.util.Scanner;

public class spiralPrint {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of cols: ");
        int columns = input.nextInt();
        int[][] arr = new int[rows][columns];
        arr = takeInput(arr, rows, columns);
        printSpiral(arr, rows, columns);
        input.close();
    }

    public static int[][] takeInput(int[][] arr, int rows, int columns){
        Scanner input = new Scanner(System.in);
        for(int i=0; i<rows; i++)
            for (int j = 0; j< columns; j++){
                System.out.print("Enter the values for arr["+i+"]["+j+"]: ");
                arr[i][j] = input.nextInt();
            }
        input.close();
        return arr;
    }

    public static void printSpiral(int[][] arr, int rows, int columns) {
        int dir = 1;
        int top = 0;
        int bottom = rows-1;
        int left = 0;
        int right = columns-1;
        int count = rows*columns;

        while(left<=right && top<=bottom){
            if (count>0){
                if (dir == 1){
                    for (int i=0; i<=right; i++){
                        System.out.print(arr[top][i]+ " ");
                        count-=1;
                    }
                    top+=1;
                    dir+=1;
                }

                else if (dir==2){
                    for (int i = top; i<=bottom; i++){
                        System.out.print(arr[i][right]+ " ");
                        count-=1;
                    }
                    right-=1;
                    dir+=1;
                }

                else if (dir ==3){
                    for (int i= right; i>=left; i--){
                        System.out.print(arr[bottom][i]+" ");
                        count-=1;
                    }
                    bottom-=1;
                    dir+=1;
                }

                else {
                    for(int i = bottom; i>top; i--){
                        System.out.print(arr[i][left]+ " ");
                    }
                    left-=1;
                    dir = 1;
                }
            }
        }
    }
}
