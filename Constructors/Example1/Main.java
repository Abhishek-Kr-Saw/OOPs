package Constructors.Example1;

// No-Argument Constructor
class Student{
    String name;
    int age;

    // no-argument constructor
    Student(){
        name = "unknown";
        age = 0;
        System.out.println("Constuctor called");
    }

    void show(){
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();
    }
}
