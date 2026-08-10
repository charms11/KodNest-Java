
public class Student {

    int roll;
    String name;
    double height;

    void run() {
        System.out.println("Running");
    }

    void sleep() {
        System.out.println("Sleeping");
    }

    void walk() {
        System.out.println("Walking");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Charmi";
        s1.height = 5.5;
        System.out.println("Student 1");
        System.out.println("Roll No:" + s1.roll);
        System.out.println("Name:" + s1.name);
        System.out.println("Height:" + s1.height);
        s1.run();
        s1.sleep();
        s1.walk();
    }
}
