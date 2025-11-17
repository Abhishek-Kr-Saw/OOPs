// To call another constructor (Constructor Chaining)

class Book {
    String name;
    int price;

    Book() {
        this("Unknown", 0); // calling parameterized constructor
    }

    Book(String name, int price) {
        this.name = name;
        this.price = price;
    }
}


public class Main {
    public static void main(String[] args) {
        
    }
}
