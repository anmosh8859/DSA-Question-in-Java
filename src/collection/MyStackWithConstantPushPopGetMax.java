package collection;

import java.util.Stack;

public class MyStackWithConstantPushPopGetMax {
    private Stack<Integer> stack = new Stack<>();
    private int max;
    public void push(int n){
        if(stack.empty()) {
            max = n;
            stack.push(n);
        } else {
            if(n>max){
                stack.push(2*n-max);
                max = n;
            } else stack.push(n);
        }
        System.out.println("Number inserted: " + n);
    }

    public void pop(){
        if(stack.empty()) System.out.println("Stack is Empty...");
        else{
            int n = stack.pop();
            System.out.print("Top Element popped: " );
            if(n>max){
                System.out.println(max);
                max = 2 * max - n;
            } else System.out.println(n);
        }
    }
    public void getMax(){
        if(stack.empty()) System.out.println("Stack is empty...");
        else System.out.println("Maximum element: " + max);
    }
    public void peek(){
        if(stack.empty()) System.out.println("Stack is Empty...");
        else {
            int n = stack.peek();
            System.out.print("The top element is: ");
            if(n > max) System.out.println(max);
            else System.out.println(n);
        }
    }
}
