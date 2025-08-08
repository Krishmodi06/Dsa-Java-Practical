package javaTAsk;
public interface inheritanceDemo {
    void animalSound();

}

class Dog implements inheritanceDemo {
    public void animalSound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animalSound();
    }
}
