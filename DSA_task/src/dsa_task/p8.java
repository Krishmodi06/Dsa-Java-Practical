package dsa_task;

import java.util.LinkedList;

public class p8 {
    public static void main(String[] args) {
        LinkedList<String> colour = new LinkedList<>();
        colour.add("Red");
        colour.add("Green");
        colour.add("Blue"); 
        colour.add("Yellow");
        
        colour.addLast("Purple");

        System.out.println("Colours in the linked list:");
        for (String col : colour) {
            System.out.println(col);
        }
    }
}