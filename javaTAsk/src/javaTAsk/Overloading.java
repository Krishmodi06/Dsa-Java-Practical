package javaTAsk;

class Overloading {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        System.out.println("Sum of integers: " + obj.add(5, 10));
        System.out.println("Sum of doubles: " + obj.add(5.5, 4.5));
        System.out.println("Concatenation: " + obj.add("Hello ", "World"));
    }
}