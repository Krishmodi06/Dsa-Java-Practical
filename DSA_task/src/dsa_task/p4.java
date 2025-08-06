package dsa_task;
    
import java.util.Stack;

public class p4 {
    public static void main(String[] args) {
        Stack<String> fruit = new Stack<>();
        fruit.push("Apple");
        fruit.push("Banana");
        fruit.push("Cherry");
        fruit.push("Date");
        fruit.push("Elderberry");
        while (!fruit.isEmpty()) {
            System.out.println("Fruit: " + fruit.pop());
        }
    }
}
