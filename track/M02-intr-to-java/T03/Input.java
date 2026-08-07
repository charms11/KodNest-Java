
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = sc.nextInt();
        System.out.println("Age is:" + age);
        System.out.println("Enter height:");
        float height = sc.nextFloat();
        System.out.println("Height is :" + height);
        sc.nextLine();
        System.out.println("Enter Full name:");
        String fname = sc.nextLine();
        System.out.println("Full Name is :" + fname);
    }

}
