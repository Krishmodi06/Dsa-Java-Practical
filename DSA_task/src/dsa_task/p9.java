package dsa_task;

import java.util.Stack;

public class p9 {
    public static void main(String[] args) {
        Stack<Integer> Numbers = new Stack<>();
        Numbers.push(10);
        Numbers.push(20);
        Numbers.push(30);   
        Numbers.addFirst(100);

        System.out.println("Stack: " + Numbers);
    }
    
}
