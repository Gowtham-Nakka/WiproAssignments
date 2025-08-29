<<<<<<< HEAD
=======
<<<<<<< HEAD
package com.gowtham;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Student Name: " + name);
    }
}

class StudentData {
    void save(Student student) {
        System.out.println("Saving student name: " + student.name);
    }
}

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        Student s = new Student("Nikhila");
        s.displayInfo();

        StudentData data = new StudentData();
        data.save(s);
    }
}
=======
>>>>>>> my-feature-branch
package com.gowtham;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Student Name: " + name);
    }
}

class StudentData {
    void save(Student student) {
        System.out.println("Saving student name: " + student.name);
    }
}

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        Student s = new Student("Nikhila");
        s.displayInfo();

        StudentData data = new StudentData();
        data.save(s);
    }
}
<<<<<<< HEAD
=======
>>>>>>> af4bfed9 (added all the files)
>>>>>>> my-feature-branch
