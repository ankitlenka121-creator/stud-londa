import java.util.Scanner;

public class missingno {
    public static void main(String[] arg) {
        Scanner fop=new Scanner(System.in);
        int choice;
        System.out.println("enter your choice");
        choice=fop.nextInt();
        if (choice==1) {
            System.out.println("brute");
            brute();
        }
        if (choice==2) {
            System.out.println("optimal");
            optimal();

        }
    }

    static void brute() {
        Scanner pop = new Scanner(System.in);
        int i,j,n,flag;

        System.out.println("enter the no of element of array");
        n=pop.nextInt();
        int[] a=new int[n-1];
        System.out.println("enter the element");
        for (i=0;i<n-1;i++) {
            a[i]=pop.nextInt();
        }
        for (i=1;i<=n;i++) {
            flag=0;
            for (j=0;j<n-1;j++) {
                if (a[j]==i) {
                    flag=1;
                    break;
                }
            }
            if (flag==0) {
                System.out.println("the missing no:" +i);

            }

        }
    }
    static void optimal(){
        Scanner sc=new Scanner(System.in);
        int n,i,sum,ms,s2;
         System.out.println("enter no of element of array");
        n= sc.nextInt();
        System.out.println("enter element of array");
        int[] r=new int[n-1];
        for(i=0;i<n-1;i++){
            r[i]=sc.nextInt();
        }
        sum=(n*(n+1))/2;
        s2=0;
        for(i=0;i<n-1;i++){
            s2=s2+r[i];

        }
         ms=sum-s2;
        System.out.println("missing no"+ms);

        }

}