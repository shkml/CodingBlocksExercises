/* - Multiple inheritance in interface is possible
* - one interface can extends 2 interfaces
* only classes can implement interfaces
* */

package OOPs;

public class Person {

    // these will chance for instances
    private String name;
    private int age;

    // final values can only be set once and are public
    // static variable means it belongs to the class
    public static final int maxInstances = 10;
    private static int number = 0;
    // creating a constructor Person
    Person(){
        System.out.println("I am default constructor");
        Person.number++;
    }

    Person(String name, int age) throws Exception{
        if (Person.maxInstances == Person.number)
            throw new Exception("Can't create any more instances");

        if (name.equals("") || name.equals(null))
            throw new Exception("Name can not be empty or null");
        else
            this.name = name;

        if (age == 0)
            throw new Exception("Age cannot be 0");
        else
            this.age = age;
        System.out.println("Parametrized constructor with 2 arguments");
        Person.number++;
    }

    /* If below objects are declared private,
     then will not be able to update the same in PersonClient
     Would only be seen in this class,
     in that case we use getters and setters*/

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
