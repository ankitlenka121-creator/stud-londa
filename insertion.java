

import java.util.Scanner;
public class insertion {
    public static void main(String[] args) {
        int i, key, k;
        Scanner orb = new Scanner(System.in);
        System.out.println("enter the no of element");
        int n = orb.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element");
        for (i = 0; i < n; i++) {
            arr[i] = orb.nextInt();
        }

        for (i = 1; i < n; i++) {
            k = i;
            while (k > 0 && arr[k] < arr[k - 1]) {
                key = arr[k];
                arr[k] = arr[k - 1];
                arr[k - 1] = key;

                k--;
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println("sorted element are:" + arr[i]);
        }
    }
}
