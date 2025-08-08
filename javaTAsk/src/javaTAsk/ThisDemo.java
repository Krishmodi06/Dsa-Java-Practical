package javaTAsk;

public class ThisDemo {
    String name;
    String age;

    ThisDemo(String name, String age) {
        System.out.println("This is the constructor of ThisDemo class");
        this.name=name;
        this.age=age;

    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        ThisDemo demo = new ThisDemo("John", "25");
        demo.display();
    }
}
