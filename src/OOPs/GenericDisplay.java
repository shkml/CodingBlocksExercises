package OOPs;

public class GenericDisplay {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40};
        display(arr);

        String[] str = {"Deepak", "Komal", "Reena"};
        display(str);

        Character[] c = {'a', 'e', 'i', 'o', 'u'};
        System.out.println(c.getClass());
        display(c);

        // Array of Cars of length 5
        Car[] cars = new Car[5];
        cars[0] = new Car(1000, 100, "red");
        cars[1] = new Car(2100, 1600, "black");
        cars[2] = new Car(1800, 1400, "yellow");
        cars[3] = new Car(1200, 1200, "green");
        cars[4] = new Car(900, 90, "white");

        bubbleSrt(cars);
        // address will display
        display(cars);
//        System.out.println(cars.getClass());
        System.out.println();
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

    public static <T extends Comparable<T>> void bubbleSrt(T[] arr){
        for(int counter = 0; counter <arr.length-1; counter++){
            for (int j=0; j<arr.length-1-counter; j++){
                if (arr[j].compareTo(arr[j+1]) > 0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
