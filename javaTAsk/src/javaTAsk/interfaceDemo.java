package javaTAsk;

interface interfaceDemo {
    void draw();
}

class Circle implements interfaceDemo {
    public void draw() {
        System.out.println("Drawing a Circle");
    }  
    
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
    }
}

