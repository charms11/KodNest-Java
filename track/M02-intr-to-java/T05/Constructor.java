
public class Constructor {

    String name;
    int age;
    double height;

    public Constructor(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }

    public static void main(String[] args) {

        Constructor c2 = new Constructor("Phuwin", 21, 5.8);
        c2.display();

    }

}
