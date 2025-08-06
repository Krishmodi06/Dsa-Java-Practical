package dsa_task;

import java.util.ArrayList;

public class p6 {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        city.add("New York");
        city.add("Los Angeles");
        city.add("Chicago");
        city.add("Houston");
        city.add("Phoenix");

        //add one more city at index 2
        city.add(2, "San Francisco");

        for (String c : city) {
            System.out.println(c);
        }
    }
    
}
