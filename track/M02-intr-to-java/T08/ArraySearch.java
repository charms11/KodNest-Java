
import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int search = s.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == search) {
                System.out.println("Element found at index " + i);
                break;
            }
        }

    }
}
