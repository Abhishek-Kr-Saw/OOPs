// To return the current object

class Person {
    String name;

    Person setName(String name) {
        this.name = name;
        return this;  // returning current object
    }

    void display(){
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Abhishek");
        //  .setName("Rahul");  // method chaining
         p.display();
    }
}

