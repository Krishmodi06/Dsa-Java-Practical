package javaTAsk;


class Employee {
	private String name;
	private String position;
	private double salary;
	
	Employee(String name,String position,Double salary){
		this.name=name;
		this.position=position;
		this.salary=salary;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		Employee em = new Employee("employee no1","Manager",100000.00);
		System.out.println("Employee name : " + em.getName());
		System.out.println("Employee Position : " + em.getPosition());
		System.out.println("Employee Salary : " + em.getSalary());

	}

}
