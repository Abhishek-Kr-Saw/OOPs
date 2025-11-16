class Car{
    String brand;
    int price;

    void details(){
        System.out.println(brand + " costs " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.price = 23000000;

        Car c2 = new Car();
        c2.brand = "Bugatti";
        c2.price = 76000000;

        c1.details();
        c2.details();
    }
}
