

import java.util.Scanner;

public class RemovingEle {

    public static void main(String[] args) {
        int[] arr;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be removed:");
        int element = sc.nextInt();
        int[] newArr = new int[n - 1];
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
