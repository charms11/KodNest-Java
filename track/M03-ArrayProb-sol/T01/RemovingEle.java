
import java.util.Scanner;

public class RemovingEle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the index of the element to be removed:");
        int removeIndex = sc.nextInt();

        if (removeIndex < 0 || removeIndex >= n) {
            System.out.println("Invalid index!");
            return;
        }

        int newArr[] = new int[n - 1];
        for (int i = 0, j = 0; i < n; i++) {
            if (i != removeIndex) {
                newArr[j++] = arr[i];
            }
        }

        System.out.println("Array elements after removal:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
}
