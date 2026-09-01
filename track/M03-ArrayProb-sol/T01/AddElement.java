
import java.util.Scanner;

public class AddElement {

    public static void main(String[] args) {
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be added:");
        int element = sc.nextInt();
        int newArr[] = new int[n + 1];
        System.arraycopy(arr, 0, newArr, 0, n);
        newArr[n] = element;

        System.out.println("Array elements are:");
        for (int i = 0; i <= n; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
