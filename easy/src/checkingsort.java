import java.util.Scanner;

public class checkingsort {
    public static void main(String[] args){
        Scanner oip= new Scanner(System.in);
        int n,i;
         n=oip.nextInt();
        int[] j=new int[n];

        for (i=0;i<n;i++){
            j[i] = oip.nextInt();}
            for (i=1;i<n;i++) {
                if(j[i]>=j[i-1]) {
                    System.out.println("sorted");
                    return;
                } else {
                    System.out.println(" not sorted");
                }

            }

        }

    }

