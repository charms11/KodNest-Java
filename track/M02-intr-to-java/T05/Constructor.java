
public class Constructor {

    String name;
    int age;
    double height;

    public Constructor() {
        name = "Charmi";
        age = 20;
        height = 5.5;
    }

    public Constructor(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Constructor(String name) {
        this.name = name;

    }

    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        c1.display();
        Constructor c2 = new Constructor("Phuwin", 21, 5.8);
        c2.display();
        Constructor c3 = new Constructor("Pond");
        c3.display();
    }

}
