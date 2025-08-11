package dsa_task;
import java.util.*;

public class DsaTask1 {
    public static void main(String[] args) {
        arrayListExample();
        hashSetExample();
        linkedListExample();
        hashMapExample();
    }

    // Task 1: ArrayList – Student Names
    static void arrayListExample() {
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Krish");
        studentNames.add("Harsh");
        studentNames.add("Jaimin");
        studentNames.add("Hem");
        studentNames.add("Patel");

        System.out.println(" Task 1: ArrayList of Student Name");
        for (String name : studentNames) {
            System.out.println(name);
        }
        System.out.println();
    }

    // Task 2: HashSet – Unique Integers
    static void hashSetExample() {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Task 2: HashSet of Unique Integers");
        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println();
    }

    // Task 3: LinkedList – Fruits
    static void linkedListExample() {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.addFirst("Apple");
        fruits.addFirst("Banana");
        fruits.addLast("Mango");
        fruits.addLast("Grapes");
        fruits.add("Orange");

        System.out.println("Task 3: LinkedList of Fruits");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println();
    }

    // Task 4: HashMap – Employee IDs & Names
    static void hashMapExample() {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "John");
        employees.put(102, "David");
        employees.put(103, "Sophia");

        System.out.println("ask 4: HashMap of Employees (ID = Name)");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println();
    }
}
