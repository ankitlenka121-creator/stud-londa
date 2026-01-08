import java.util.Scanner;
import java.util.InputMismatchException;


public class selection {
    public static void main(String[] args) {
        Scanner goi = new Scanner(System.in);
        System.out.print("enter the number of elements: ");

        int n;
        n = goi.nextInt();
        int[] arr = new int[n];


        int i, j, o;
        System.out.println("enter the element");
        for (i = 0; i < n; i++) {
            arr[i] = goi.nextInt();
        }
        for (i=0;i<= n-2;i++) {
            int min=i;
            for (j=i;j<=n-1;j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                    break;
                }
            }
                o = arr[min];
                arr[min] = arr[i];
                arr[i] = o;
            }
System.out.print("sorted array:");
        for(i=0;i<n;i++) {
            System.out.println(arr[i] + " ");
        }
        goi.close();
    }
}