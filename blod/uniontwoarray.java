import java.util.HashSet;
import java.util.Scanner;

public class uniontwoarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;
        System .out.println("enter your choice");
        choice= sc.nextInt();
        if(choice==1){
            System.out.println("brute");
            brute();

        }
        if(choice==2){
            System.out.println("optimal");
            optimal();
        }
    }
    static void brute(){
Scanner joi=new Scanner(System.in);
int n,m,j;
        System.out.println("enter the no of element of a1 ");
n= joi.nextInt();
int[] a1=new int[n];
        System.out.println("enter the element of a1 ");
for(j=0;j<n;j++){
    a1[j]=joi.nextInt();

}
        System.out.println("enter the no of element of a2 ");
        m= joi.nextInt();

        int[] a2=new int[m];
        System.out.println("enter the element of a2 ");
        for(j=0;j<m;j++) {
            a2[j] = joi.nextInt();
        }
            HashSet<Integer> set=new HashSet<>();
        for(j=0;j<n;j++){
            set.add(a1[j]);
        }
        for(j=0;j<m;j++){
            set.add(a2[j]);
        }
        System.out.println("union array:");
        for(int x:set){
            System.out.print(x+" ");
        }
    }
    static void optimal(){

    }
}
