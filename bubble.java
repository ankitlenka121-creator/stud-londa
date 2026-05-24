import java.util.Scanner;

public class bubble {
    public static void main(String[] args){
        Scanner bub=new Scanner(System.in);
        System.out.println("enter the number of element");
        int n= bub.nextInt();
        int i,j,k;
        int[] a=new int[n];
        System.out.println("enter the element");
for (i=0;i<n;i++) {
    a[i] = bub.nextInt();
}
for(i=n-1;i>=1;i--){
    for (j=0;j<=i-1;j++){
        if (a[j] > a[j+1]) {
            k=a[j];
            a[j]=a[j+1];
            a[j+1]=k;


        }
    }
}
System.out.println("the sorted array :");
        for (i=0;i<n;i++){
            System.out.println(a[i] + "");

      }

    }
}

