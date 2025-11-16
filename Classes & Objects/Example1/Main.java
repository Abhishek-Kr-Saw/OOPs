// A class is a template. It defines what data an object will have and what action it can perform.
// An object is a real instance created from a class. Each object has its own copy of the class's variable.

// A class does not occupy heap memory. An object does.

class Student{
    String name;
    int age;

    void showInfo(){
        System.err.println(name+" is "+age+" years old");
    }
}

public class Main{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amit";
        s1.age = 21;
        
        s1.showInfo();
    }
}