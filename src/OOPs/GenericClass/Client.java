package OOPs.GenericClass;

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
    }
}
