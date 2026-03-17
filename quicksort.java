import java.util.Scanner;

public class quicksort {
    public static void main(String[] args) {
        Scanner qs = new Scanner(System.in);
        System.out.println("enter the number of element");
        int n = qs.nextInt();
        int i, j, k;
        int[] a = new int[n];
        System.out.println("enter the element");
        for (i = 0; i < n; i++) {
            a[i] = qs.nextInt();
        }
        int low = 0, high = n - 1;
        new quicksort(a, low, high);
        System.out.print("sorted array:");
        for (i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }

    }

    quicksort(int[] a, int low, int high) {
        if (low < high) {
            int pIndex = f(a, low, high);
            new quicksort(a, low, pIndex - 1);
            new quicksort(a, pIndex + 1, high);

        }
    }

    static int f(int[] a, int low, int high) {
        int temp;

        int pivot = a[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (a[i] <= pivot && i <= high) {
                i++;

            }

            while (a[j] >= pivot && i <= low) j--;
            if (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            temp = a[low];
            a[low] = a[j];
            a[j] = temp;

            return j;
        }
        return j;
    }
}

