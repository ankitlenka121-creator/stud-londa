import java.util.Scanner;

public class largest {

    public static void main(String[] args) {

        Scanner pew=new Scanner(System.in);
        int n=pew.nextInt();
        int[] a = new int[n];
        int i;
        for ( i=0;i<n;i++){
            a[i]=pew.nextInt();
        }

        int largest=a[0];
        for(i=0;i<n;i++) {
            if(a[i]>largest)
                largest=a[i];

        }
        System.out.println ("largest no= " + largest);
    }
}

