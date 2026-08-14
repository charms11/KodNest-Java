
public class Ex1ver {

    String name;
    int age;
    double height;

    Ex1ver(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }

    public static void main(String[] args) {
        Ex1ver e1 = new Ex1ver("Charmi", 20, 5.5);
        e1.display();

    }
}
