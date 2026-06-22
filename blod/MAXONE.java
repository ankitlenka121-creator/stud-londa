import java.util.Scanner;

public class MAXONE {
    public static void main(String[] args){
        Scanner kon=new Scanner(System.in);
        int n,i,max=0,count=0;
         System.out.println("enter the no of element");
        n= kon.nextInt();
        System.out.println("enter the element");
        int[] h=new int[n];
        for(i=0;i<n;i++){
            h[i]=kon.nextInt();
        }
        for(i=0;i<n;i++){
       if(h[i]==1){
       count=count+1;
       if (count>max){
           max= count;

       }

       }
       else{
           count=0;
       }}
           System.out.println("maxone:"+max);


}}
