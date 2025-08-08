package javaTAsk;

class Parent {
    String name = "Parent Class";

    Parent() {
        System.out.println("Parent constructor called");
    }

    void display() {
        System.out.println("Display from Parent");
    }
}

class Child extends Parent {
    String name = "Child Class";

    Child() {
        super();
        System.out.println("Child constructor called");
    }

    void display() {
        super.display();
        System.out.println("Name in Parent: " + super.name);
        System.out.println("Name in Child: " + name);
    }
}

class SuperKeywordDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
 