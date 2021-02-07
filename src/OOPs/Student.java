package OOPs;

public class Student {

    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception{
        if (age <0)
            throw new Exception("Age cannot be negative");

        this.age = age;
    }
}
