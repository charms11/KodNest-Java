
import java.util.Scanner;

public class AntiClockWise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of positions to rotate:");
        int k = sc.nextInt();
        if (n > 0) {
            k = k % n;
        }

        // Anti-clockwise (Left) Rotation
        int rotated[] = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + k) % n];
        }

        System.out.println("Array elements after anti-clockwise rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
        System.out.println();
    }
}
