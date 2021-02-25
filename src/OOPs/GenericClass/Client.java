package OOPs.GenericClass;

import OOPs.Car;

public class Client {
    public static void main(String[] args) {

        Pair<String> ins = new Pair<>();
        ins.one = "abc";
        ins.two = "def";

        Pair<Integer> ins2 = new Pair<>();
        ins2.one = 9;
        ins2.two = 10;

        Pair2<String, Integer> ins3 = new Pair2<>();
        ins3.data1 = "komal";
        ins3.data2 = 26;

        // if i pass 'int' will throw error as same is primitive data type.
        // Integer is a class.

        // Generics will always have a class type argument
        Car[] cars = new Car[5];
        cars[0] = new Car(1000, 100, "red");
        cars[1] = new Car(2100, 1600, "black");
        cars[2] = new Car(1800, 1400, "yellow");
        cars[3] = new Car(1200, 1200, "green");
        cars[4] = new Car(900, 90, "white");

        // generic linked list
        LinkedListGeneric<Car> list = new LinkedListGeneric<Car>();
        list.addLast(cars[0]);
        list.addLast(cars[1]);
        list.addLast(cars[2]);
        list.addLast(cars[3]);
        list.addLast(cars[4]);

        list.traverse();
    }
}
