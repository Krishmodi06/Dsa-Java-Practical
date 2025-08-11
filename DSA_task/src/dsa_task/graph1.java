package dsa_task;
import java.util.*;

public class graph1 {
    public static void main(String[] args) {
       
        HashMap<String, List<String>> graph = new HashMap<>();

        // Adding connections
        graph.put("Pune", Arrays.asList("Mumbai", "Delhi"));
        graph.put("Mumbai", Arrays.asList("Pune", "Kolkata"));
        graph.put("Delhi", Arrays.asList("Pune"));
        graph.put("Kolkata", Arrays.asList("Mumbai"));

        // Printing each city and its connections using a normal for loop
        System.out.println("City connections:");
        for (String city : graph.keySet()) {
            System.out.print(city + " is connected to: ");
            List<String> connections = graph.get(city);
            
            for (int i = 0; i < connections.size(); i++) {
                System.out.print(connections.get(i));
                if (i < connections.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}