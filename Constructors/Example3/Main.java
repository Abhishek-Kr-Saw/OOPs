package Constructors.Example3;

//Constructor overloading
class Box {
    int height;
    int width;

    Box() {
        height = 1;
        width = 1;
    }

    Box(int s) {
        height = s;
        width = s;
    }

    Box(int h, int w) {
        height = h;
        width = w;
    }

    void show() {
        System.out.println(height + " x " + width);
    }
}
public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(12);
        Box b3 = new Box(12,13);

        b1.show();
        b2.show();
        b3.show();
    }
}
