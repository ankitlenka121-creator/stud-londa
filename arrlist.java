import java.util.*;

public class arrlist {


static void main(String[] args){
    ArrayList<Integer> ali1=new ArrayList<>(20);
    ArrayList<Integer> ali2=new ArrayList<>(List.of(50,60,70,80,90));

    ali1.add(10);
ali1.add(0,5);
ali1.addAll(1,ali2);
System.out.println(ali1);
System.out.println(ali1.contains(50));
}
}