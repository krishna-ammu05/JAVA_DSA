public class Student {
    int id;
    String name;

    // 1. Default Constructor
    Student() {
        System.out.println("Default Constructor called");
        id = 0;
        name = "Unknown";
    }

    // 2. Parameterized Constructor
    Student(int studentId, String studentName) {
        System.out.println("Parameterized Constructor called");
        id = studentId;
        name = studentName;
    }

    // 3. Copy Constructor (manually created)
    Student(Student other) {
        System.out.println("Copy Constructor called");
        this.id = other.id;
        this.name = other.name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        // Default constructor
        Student s1 = new Student();
        s1.display();

        // Parameterized constructor
        Student s2 = new Student(101, "Alice");
        s2.display();

        // Copy constructor
        Student s3 = new Student(s2);
        s3.display();
    }
}


