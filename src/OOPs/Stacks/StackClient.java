package OOPs.Stacks;

public class StackClient {
    public static void main(String[] args) throws Exception{
        StackUsingArrays stack = new StackUsingArrays(5);

        for (int i=1; i<=5; i++){
            stack.push((i+1)*10);
            stack.display();
        }

        // Since stack is full now, below command should show an exception
        // stack.push(70);

        System.out.println(stack.top());
        stack.pop();
        stack.display();
        System.out.println(stack.top());

/*        stack.push(10);
        stack.display();

        stack.push(20);
        stack.display();*/
    }
}
