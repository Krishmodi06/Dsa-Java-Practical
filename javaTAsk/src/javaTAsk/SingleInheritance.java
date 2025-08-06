package javaTAsk;

class person{
	String name ;
	int age;
	
	person(String name, int age ){
		this.name=name;
		this.age= age;
	}
	
	void displayPersonInfo() {
		System.out.printf("\nName : %s",name);
		System.out.printf("\nAge : %d", age);
		
	}
}

class Student extends person{
	int studentId ;
	String courseName;
	
	Student(String name,int age, int studentId,String courseName){
		super(name,age);
		this.studentId=studentId;
		this.courseName=courseName;
	}
	
	void displayStudentInfo(){
		displayPersonInfo();
		System.out.printf("\nStudent Id : %d", studentId);
		System.out.printf("\nCourse Name : %s", courseName);
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		Student student = new Student("Krish",18,1234,"AIML");
		student.displayStudentInfo();
		
	}

}
