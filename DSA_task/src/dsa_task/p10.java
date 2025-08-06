package dsa_task;

import java.util.ArrayList;

public class p10 {
    public static void main(String[] args) {
        ArrayList<String> brands = new ArrayList<>();
        brands.add("realme");
        brands.add("samsung");
        brands.add("apple");
        brands.add("nokia");
        brands.add("oneplus");
 
        int middle = brands.size() / 2;
        brands.add(middle, "xiaomi");
        System.out.println("Brands after adding xiaomi: " + brands);

    }

    
}