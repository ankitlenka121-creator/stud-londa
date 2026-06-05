import java.util.ArrayList;
import java.util.Scanner;

public class movezero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice");
        int choice;
        choice = sc.nextByte();
        if (choice == 1) {
            System.out.println("brute");
            brute();
        }
        if (choice == 2) {
            System.out.println("optimal");
            optimal();
        }
    }
        static void brute(){
        Scanner gin=new Scanner(System.in);
        int i,nz = 0,n;
            System.out.println("enter the no of element");
            n= gin.nextInt();
            int[] a=new int[n];
            System.out.println("enter the element");
            for(i=0;i<n;i++){
                a[i]= gin.nextInt();
            }
            ArrayList<Integer> temp =new ArrayList<>();
            for(i=0;i<n;i++){
                if (a[i]!=0){
                    nz++;
                    temp.add(a[i]);
                }
            }
           int tempsize=nz;
            for(i=0;i<tempsize;i++){
                a[i]= temp.get(i);

            }
            for(i=tempsize;i<n;i++){
                a[i]=0;
            }
            System.out.println("new array =");
            for(i=0;i<n;i++){
                System.out.print( a[i]+" ");
            }
        }

        static void optimal() {
        }

}

