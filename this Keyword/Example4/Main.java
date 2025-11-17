// To pass the current object as an argument
// Used when current object needs to be passed to another method or constructor.

class A {
    void display() {
        System.out.println("Inside display");
    }

    void test() {
        B obj = new B();
        obj.get(this);  // passing current object
    }
}

class B {
    void get(A a) {
        a.display();
    }
}


public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.get(a);
    }
}
