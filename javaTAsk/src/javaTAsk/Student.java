package javaTAsk;

class Student {
    void dislayInfo(String name, int age) {
        System.out.println("Student Name : " + name);
        System.out.println("Student Age : " + age);
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.dislayInfo("John Doe", 20);
    }
}