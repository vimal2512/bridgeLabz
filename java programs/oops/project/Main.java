//Online course management system


abstract class Person {
    protected String name;
    protected String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract void displayInfo();
}

class Student extends Person {
    private int studentId;

    public Student(String name, String email, int studentId) {
        super(name, email);
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("ID: " + studentId);
    }

    public void enroll(Course course) {
        System.out.println(name + " enrolled in " + course.getCourseName());
    }
}

class Instructor extends Person {
    private String expertise;

    public Instructor(String name, String email, String expertise) {
        super(name, email);
        this.expertise = expertise;
    }

    @Override
    public void displayInfo() {
        System.out.println("Instructor Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Expertise: " + expertise);
    }

    public void teachCourse() {
        System.out.println(name + " is teaching a course.");
    }
}

class Course {
    private final String courseId;
    private String courseName;
    private Instructor instructor; // aggregation

    public Course(String courseId, String courseName, Instructor instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void showDetails() {
        System.out.println("Course: " + courseName + ", ID: " + courseId);
        instructor.displayInfo(); // association
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Try block to simulate safe object creation and interaction
            Instructor ins = new Instructor("Stalin", "stalin@gmail.com", "Java");
            Course javaCourse = new Course("C101", "Java OOPS", ins);
            Student student = new Student("Sriram", "ramsri@gmail.com", 101);

            javaCourse.showDetails();
            student.displayInfo();
            student.enroll(javaCourse);
            ins.teachCourse();

            // Uncomment below to simulate NullPointerException
            // Course nullCourse = new Course("C102", "Spring Boot", null);
            // nullCourse.showDetails(); // This will cause a NullPointerException

        } catch (NullPointerException e) {
            System.out.println("Error: Instructor not assigned to course. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        } finally {
            System.out.println("Program executed. Resources cleaned up if needed.");
        }
    }
}
