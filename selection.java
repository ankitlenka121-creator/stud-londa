import java.util.Scanner;
import java.util.InputMismatchException;


public class selection {
    //function of perform selection sort
    public static void main(String[] args) {
        Scanner goi = new Scanner(System.in);
        System.out.print("enter the number of elements: ");

        int n;
        n = goi.nextInt();
        int[] arr = new int[n];


        int i, j, o;
        System.out.println("enter the element");
        //traverse through all array element
        for (i = 0; i < n; i++) {
            arr[i] = goi.nextInt();
        }//selection sort
        for (i=0;i<= n-2;i++) {
            int min=i;// assume current index hold the minimum
            //find the minimum elemnt in the remaining address
            for (j=i;j<=n-1;j++) {
                if (arr[min] > arr[j]) {
                    min = j;// update min if smaller is found
                    break;
                }
            }
            // swap the found minimum element with the first element of unsorted part
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