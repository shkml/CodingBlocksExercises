// Here, we are finding the next greater element for each element present inside the array

package OOPs.Concepts;

import java.util.Stack;

public class nextGreaterElement {

    public static void main(String[] args) {

        int[] arr = {2,1,3,8,6,7,5};

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty()&&arr[i]>stack.peek()){
                int rv = stack.pop();
                System.out.println(rv +" --> " +arr[i]);
            }
            stack.push(arr[i]);
        }

        while(!stack.isEmpty()){
            int rv = stack.pop();
            System.out.println(rv +" --> " +-1);
        }
    }
}
