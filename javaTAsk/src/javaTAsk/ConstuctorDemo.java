public class ConstuctorDemo {
    String FirstName;
    String LastName;

    ConstuctorDemo(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
    void display() {
        System.out.println("First Name: " + FirstName);
        System.out.println("Last Name: " + LastName);
    }
    public static void main(String[] args) {
        ConstuctorDemo obj = new ConstuctorDemo("John", "Doe");
        obj.display();
    }
}
