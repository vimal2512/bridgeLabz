interface Vehicle {
    void start();   // public + abstract
    void stop();
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started");
    }

    public void stop() {
        System.out.println("Bike stopped");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.stop();
    }
}
