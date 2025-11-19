class Car {
    String color;
    int speed;

    void start() {
        System.out.println("Car is starting...");
    }

    void showDetails() {
        System.out.println("Color: " + color + ", Speed: " + speed + " km/h");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.speed = 120;

        myCar.start();
        myCar.showDetails();
    }
}
