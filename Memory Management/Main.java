class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("A");
        Student s2 = new Student("B");
    }
}

// s1,s2 -> goes in Stack
// A,B   -> goes in Heap