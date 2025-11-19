interface A {
    void showA();
}

interface B {
    void showB();
}

class C {
    void showC() {
        System.out.println("This is class C");
    }
}

class D extends C implements A, B {
    public void showA() {
        System.out.println("This is interface A");
    }

    public void showB() {
        System.out.println("This is interface B");
    }
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {
        D obj = new D();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}
