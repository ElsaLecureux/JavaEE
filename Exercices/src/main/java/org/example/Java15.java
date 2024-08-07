package org.example;

public class Java15 {
    public static class Student{
       Integer studentId;
       String studentName;
       String grade;

       public Student() {
           this.studentId= 0;
           this.studentName= "Unknown";
           this.grade= "None";
       }

        public Student(Integer studentId, String studentName, String grade) {
           this.studentId= studentId;
           this.studentName= studentName;
           this.grade= grade;
        }
    }

    public static void main(String[] args) {
        Student student1= new Student();
        Student student2= new Student(101, "Cullen", "A");
        System.out.println("Id Student1: " + student1.studentId + ", Name Student1: " + student1.studentName + ", Grade Student1: " + student1.grade );
        System.out.println("Id Student2: " + student2.studentId + ", Name Student2: " + student2.studentName + ", Grade Student2: " + student2.grade );
    }
}
