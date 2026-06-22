import java.util.ArrayList;
import java.util.Scanner;

public class movezero {
    public static void main(String[] args) {
        Scanner nest = new Scanner(System.in);

        System.out.println("enter the choice");
        int choice;
        choice = nest.nextByte();
        if (choice == 1) {
            System.out.println("brute");


            brute();
        }
        if (choice == 2) {
            System.out.println("optimal");


            optimal();
        }
    }

    static void brute() {
        Scanner horn = new Scanner(System.in);
        int n, i, nz = 0, tempsize;
        System.out.println("enter the no of element");
        n = horn.nextInt();
        int[] a = new int[n];
        System.out.println("enter the element");
        for (i = 0; i < n; i++) {


            a[i] = horn.nextInt();
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for (i = 0; i < n; i++) {
            if (a[i] != 0) {

                temp.add(a[i]);
                nz++;
            }
        }
        tempsize = nz;
        for (i = 0; i < tempsize; i++) {
            a[i] = temp.get(i);
        }
        for (i = tempsize; i<n; i++) {
            a[i] = 0;

        }

        System.out.println("new array");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");

        }
    }


    static void optimal() {
    }
}