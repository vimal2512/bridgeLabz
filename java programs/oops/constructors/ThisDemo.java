class Book {
    String title;

    Book(String title) {
        this.title = title; // Without this, both refer to parameter
    }

    void display() {
        System.out.println("Title: " + this.title);
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Book b = new Book("Java Basics");
        b.display();
    }
}
