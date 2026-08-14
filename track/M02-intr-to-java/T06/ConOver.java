
public class ConOver {

    String name;
    int age;
    double height;

    public ConOver() {
        name = "Charmi";
        age = 20;
        height = 5.5;
    }

    public ConOver(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public ConOver(String name) {
        this.name = "Pond";

    }

    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }

    public static void main(String[] args) {
        ConOver c1 = new ConOver();
        c1.display();
        ConOver c2 = new ConOver("Phuwin", 21, 5.8);
        c2.display();
        ConOver c3 = new ConOver("Pond");
        c3.display();
    }

}
