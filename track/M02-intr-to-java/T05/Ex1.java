
public class Ex1 {

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Height :" + height);
    }

    public static void main(String[] args) {
        Ex1 s1 = new Ex1();
        s1.input("Charmi", 20, 5.5);
        s1.display();

    }
}
