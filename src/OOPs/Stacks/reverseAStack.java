package OOPs.Stacks;

public class reverseAStack {
    public static void main(String[] args) throws Exception {

        StackUsingArrays s = new StackUsingArrays(5);

        // fill the stack
        System.out.println(s.size()); // 0
        for (int i=0; i < 5; i++)
            s.push((i+1)*10);
        s.display();

        StackUsingArrays helper = new StackUsingArrays(5);
        reverseStack(s, helper, 0   );
        s.display();
    }

    public static void reverseStack(StackUsingArrays stack, StackUsingArrays helper, int index) throws Exception{
        if (stack.isEmpty())
            return;

        int item = stack.pop(); // 50, 40, 30, 20, 10 end
        reverseStack(stack, helper, index+1);
        helper.push(item);

        if (index == 0) {
            while (!helper.isEmpty()) {
                stack.push(helper.pop());
            }
        }
    }
}
