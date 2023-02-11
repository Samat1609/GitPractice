package oop.digital_nomads;

public class StudentMain {
    public static void main(String[] args) {
        Student student=new Student();
        Student student1=new Student(12345);
        Student student2=new Student(1234,"Samat");

        student.learnJava();

        // implicite   неявно
        // explicite    явно
    }
}
