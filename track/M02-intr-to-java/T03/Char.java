
import java.util.Scanner;

public class Char {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        char ch = sc.next().charAt(4);
        System.out.println(ch);
    }
}
