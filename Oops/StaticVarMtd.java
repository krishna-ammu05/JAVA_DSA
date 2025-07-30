
    class Student {
    int rollNo;
    String name;
    static String college = "JNTUH"; // static variable

    // constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // static method
    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
public class StaticVarMtd {
   public static void main(String[] args) {
        Student s1 = new Student(101, "Krishna");
        Student s2 = new Student(102, "Arya");

        s1.display();
        s2.display();

        Student.changeCollege("OU"); // calling static method

        s1.display();
        s2.display();
    }
    }
}
