import java.util.Scanner;

public class leftrotationoneplace {

public static void main(String[] args){
    Scanner fo=new Scanner(System.in);
    int i,temp,n;
    System.out.println("enter the no of element");
    n= fo.nextInt();
    int[] u=new int[n];
    System.out.println("enter the element of array");
    for(i=0;i<n;i++){
        u[i]=fo.nextInt();
    }
    temp=u[0];
    for(i=1;i<n;i++){
        u[i-1]=u[i];
    }

        u[n-1]=temp;
    System.out.println("new array");
    for(i=0;i<n;i++){
        System.out.print (u[i]+" ");


    }
    }
}