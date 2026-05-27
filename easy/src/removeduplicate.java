import java.util.Scanner;

public class removeduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,k;
        n=sc.nextInt();
        int[] kia=new int[n];
        System.out.println("enter sorted arrray:");
        for (i=0;i<n;i++) {
            kia[i] = sc.nextInt();
        }
        i = optimal(kia,n);
        //i=0;


        //  for (int j=1;j<n;j++){
        //       if(kia[i]!=kia[j]) {
        //        i++;
        //      kia[i] = kia[j];



        System.out.println("new array=");
        for(k=0;k<=i;k++){
            System.out.println(kia[k]+"");
        }
    }
    static int optimal(int[]kia,int n) {
        int i = 0;


        for (int j = 1; j < n; j++) {
            if (kia[i] != kia[j]) {
                i++;
                kia[i] = kia[j];
            }
        }
        return i;
    }
}

