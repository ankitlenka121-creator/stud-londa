import java.util.Arrays;
import java.util.Scanner;

public class secondbrute {
    public static void main(String[] args){
        Scanner milf=new Scanner(System.in);
        int i,n,largest, slargest = -1;

        n=milf.nextInt();
        int[] h=new int[n];
        for(i=0;i<n;i++){
            h[i]= milf.nextInt();
        }
        Arrays.sort(h);
        largest=h[n-1];
        for(i=n-2;i>=0;i--) {
            if (h[i] != largest) {
                slargest = h[i];
                break;
            }
        }
            System.out.println("second largest= " +slargest);
            

    }
}
