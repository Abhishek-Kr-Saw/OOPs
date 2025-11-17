// To call another method of the same class 

class Demo {
    void show() {
        System.out.println("Inside show");
    }

    void display() {
        this.show(); // calling the other method
    }
}


public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}
