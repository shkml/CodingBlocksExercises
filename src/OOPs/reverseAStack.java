package OOPs;

public class reverseAStack {
    public static void main(String[] args) throws Exception {

        StackUsingArrays s = new StackUsingArrays(10);

        // fill the stack
        System.out.println(s.size()); // 0
        for (int i=0; i < 10; i++)
            s.push((i+1)*10);
        s.display();

        StackUsingArrays helper = new StackUsingArrays(5);
        reverseStack(s, helper, 0   );
        s.display();
    }

    public static void reverseStack(StackUsingArrays stack, StackUsingArrays emptyStack, int index) throws Exception{


    }
}
