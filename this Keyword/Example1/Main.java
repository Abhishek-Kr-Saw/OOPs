// To refer to the current object’s instance variables

class Student {
    String name;
    int age;

    Student(String naam, int age) {
        name = naam;  // left side = instance variable, right side = local parameter
        this.age = age;    // this is only required when both names are same.
    }

    void detail(){
        System.out.println("Name : "+name+" age : "+age);
    }
}


public class Main {
    public static void main(String[] args) {
        Student s = new Student("Abhi", 22);
        s.detail();
    }
}
