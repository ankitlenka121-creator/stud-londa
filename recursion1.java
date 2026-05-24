import java.util.Scanner;

public class recursion1 {
    static void doine(int i, int n){
        if(i>n)
        {return;
    }
        System.out.println("ankit ");
        i=i+1;
        doine(i,n);


}
public static void main(String[] args){
    Scanner pro=new Scanner(System.in);
    int n=pro.nextInt();
    doine(1,n);



}
}