
public class This {

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Height:" + this.height);
    }

    public static void main(String[] args) {

        This s1 = new This();
        s1.input("Charmi", 20, 5.5);
        s1.display();

        This s2 = new This();
        s2.input("Khun", 21, 5.6);
        s2.display();

        This s3 = new This();
        s3.input("Phuwin", 20, 5.8);
        s3.display();

        This s4 = new This();
        s4.input("Pond", 21, 5.7);
        s4.display();

        This s5 = new This();
        s5.input("Gemini", 22, 5.9);
        s5.display();
    }
}
