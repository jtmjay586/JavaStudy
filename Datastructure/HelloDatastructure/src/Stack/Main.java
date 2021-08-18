package Datastructure.HelloDatastructure.src.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack()      ;
        if(stack.empty()) {
            stack.push(1);
            stack.push(2);
            stack.push(3);
        }

        if(stack.peek() == 3)
        stack.pop();
        
        if(stack.search(3) == -1){
            System.out.println("3 is poped");
        }
    }
    
}
