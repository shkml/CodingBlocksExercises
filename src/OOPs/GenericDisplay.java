package OOPs;

public class GenericDisplay {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40};
        display(arr);

        String[] str = {"Deepak", "Komal", "Reena"};
        display(str);

        Character[] c = {'a', 'e', 'i', 'o', 'u'};
        display(c);
    }

/*
    public static void display(int[] arr) {
        for (int val : arr)
            System.out.print(val + " ");
        System.out.println();
    }
*/

    // generic function - T could be replaced by some other variable as well.
    public static <T> void display(T[] s){
        for (T val: s)
            System.out.print(val+ " ");
        System.out.println();
    }
}
