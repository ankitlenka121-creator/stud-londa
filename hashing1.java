
import java.util.Scanner;

public class hashing1 {
    public static void main(String[] args) {

        Scanner goi = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = goi.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = goi.nextInt();
        }

        // Selection Sort
        for (int i = 0; i <= n - 2; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap after inner loop
            int o = arr[min];
            arr[min] = arr[i];
            arr[i] = o;
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        goi.close();
    }
}
