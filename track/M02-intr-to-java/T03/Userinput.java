
import java.util.Scanner;

public class Userinput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value:");
        int a = sc.nextInt();
        System.out.println("integer value is:" + a);
        System.out.println("Enter the float value:");
        float b = sc.nextFloat();
        System.out.println("float value is:" + b);
        System.out.println("Enter short value:");
        short c = sc.nextShort();
        System.out.println("short value is :" + c);
        System.out.println("Enter double value:");
        double d = sc.nextDouble();
        System.out.println("double value is :" + d);
        System.out.println("Enter byte value:");
        byte e = sc.nextByte();
        System.out.println("byte value is :" + e);
    }

}
