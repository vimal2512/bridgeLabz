abstract class Shape {
    abstract void draw();  // abstract method

    void showType() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Shape s = new Circle(); // Polymorphism
        s.draw();               // Overridden
        s.showType();           // Concrete from parent
    }
}
