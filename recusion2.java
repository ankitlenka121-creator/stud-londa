import java.util.Scanner;

public class recusion2 {
    static void number(int i,int r) {
        if (i > r) {
            return;
        }
        System.out.println("   " + i);
        i = i + 1;
        number(i, r);
    }
    public static void main(String[] args){
        Scanner out=new Scanner(System.in);
        int i=out.nextInt();
        int r=out.nextInt();
        number(i,r);

    }






















    }

