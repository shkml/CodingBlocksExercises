package OOPs;

// Overloading doesnt happen on return type basis

public class functionOverloading {
    public static void main(String[] args) {

        int res1 = sum(4, 8);
        double res2 = sum(9, 6);

        System.out.println(res1 +" "+res2);
        System.out.println(sum(5, 7, 2));

        System.out.println(sum(6,5,4, 7));
    }

    public static int sum(int a, int b) {
        return a+b;
    }

    public static int sum(int a, int b, int c) {
        return a+b;
    }

    public static double sum(double a, double b) {
        return a+b;
    }

    /*Variable number of arguments
    variable argument is always the last one
    could have some variables and the variable argument
    */
    public static int sum(int... args){
        System.out.println("In args");
        int sum = 0;
        for (int a: args)
            sum+= a;

        return sum;
    }
}
