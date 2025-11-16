package Constructors.Example2;

// Parameterized Constructor
class Car{
    String brand;
    int price;

    Car(String brand,int price){
        this.brand = brand;
        this.price = price;
    }

    void display(){
        System.out.println(brand+" : "+price);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("BMW-M4 Competition", 15300000);
        c.display();
    }
}

