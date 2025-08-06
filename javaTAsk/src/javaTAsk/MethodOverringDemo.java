package javaTAsk;

class Animal{
	void animalAbility() {}
}

class Dog extends Animal{
	@Override
	void animalAbility(){
		System.out.println("Dog barks loudly");
	}
}

public class MethodOverringDemo {

	public static void main(String[] args) {
 
		Dog dog = new Dog();
		dog.animalAbility();
	}

}
