package dsa_task;

import java.util.LinkedList;
import java.util.Queue;

public class p5 {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        System.out.println("numbers: " + numbers);
    }
}