package OOPs;

import java.util.Comparator;

public class CarColorComparator implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        return o1.color.compareTo(o1.color);
    }
}
