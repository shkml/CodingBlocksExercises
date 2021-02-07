package OOPs;

public class StackClient {
    public static void main(String[] args) throws Exception{
        StackUsingArrays stack = new StackUsingArrays(5);

        stack.push(10);
        stack.display();

        stack.push(20);
        stack.display();
    }
}
