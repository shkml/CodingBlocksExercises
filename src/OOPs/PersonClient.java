package OOPs;

public class PersonClient {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person(); // Create an object of Person class
        Person p2 = new Person();

        // Below will not work since variable as private now
       /* System.out.println(p1.age);
        System.out.println(p1.name);

        p2.name = "Komal";
        p2.age = 26;

        System.out.println(p2.age); -> 0
        System.out.println(p2.name) -> null;*/

        // Access specifiers - Public, Protected, Private and default
        // Private - visible inside same class
        // Public - Visible everywhere
        // Protected - will study later
        // Default - visible inside same package

        // Set name and age
        p2.setName("Deepak");
        p2.setAge(28);

        System.out.println(p2.getName());
        System.out.println(p2.getAge());

        Person p3 = new Person("Reena", 32);

        System.out.println(p3.getAge());
        System.out.println(p3.getName());

//        Person p4 = new Person("", 0);
    }
}
