package OOPs;

public class staticTest {
    static public int wheels = 10;

    public static void main(String[] args) {
        staticTest s = new staticTest();
        staticTest s1 = new staticTest();
        staticTest s2 = new staticTest();

        s2.wheels = 21;

        System.out.println(s.wheels);
        System.out.println(s1.wheels);
        System.out.println(s2.wheels);
    }
}
