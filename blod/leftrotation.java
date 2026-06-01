import java.util.ArrayList;
import java.util.Scanner;

public class leftrotation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;


        System.out.println("enter your choice");
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
        Scanner po=new Scanner(System.in);
        int n,j,i,d=4;
        System.out.println("enter the no of element");
       n= po.nextInt();

        int[] a=new int[n];
        System.out.println("enter the element");
        for (i=0;i<n;i++) {

            a[i] = po.nextInt();
        }
   ArrayList<Integer> temp=new ArrayList<>();

        for(i=0;i<d;i++) {
            temp.add(a[i]);
        }
        for (i=d;i<n;i++){
            a[i-d]=a[i];
        }
        j=0;
        for(i=n-d;i<n;i++){
            a[i]= temp.get(j);
            j++;
        }
        System.out.println("new array");
        for(i=0;i<n;i++) {
            System.out.print(a[i]+" ");


        }
    }
    static void optimal(){
        Scanner ho=new Scanner(System.in);

        int n,i,a,b,temp,k,l,c;
       int f = 0;
        System.out.println("enter the no of element ");
        n=ho.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the element");
        for(i=0;i<n;i++){
            arr[i]= ho.nextInt();

        }


           a=0;
           b=3;
           while (a<b){
               temp=arr[a];
               arr[a]=arr[b];
               arr[b]=temp;
               a++;
               b--;
           }
           k=4;
           l=n-1;
           while(k<l){
               temp=arr[k];
               arr[k]=arr[l];
               arr[l]=temp;
               k++;
               l--;
           }
           c=0;
           f=n-1;
           while(c<f){
               temp=arr[c];
               arr[c]=arr[f];
               arr[f]=temp;
              c++;
              f--;
           }


            System.out.println("new array ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
