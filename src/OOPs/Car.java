package OOPs;

public class Car implements Comparable<Car>{

    int speed;
    int price;
    String color;

    public Car(int speed, int price, String color){
        this.speed = speed;
        this.price = price;
        this.color = color;
    }

    /* Since below toString method is written in the class, the same will be called instead of
    to string of Object class
    */
    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car other) {
        // the more speed the better
        // return this.speed - other.speed;

        // the less price the better
        // return this.price - other.price;

        // on the basis of color i.e., String
        return this.color.compareTo(other.color);
    }
}
