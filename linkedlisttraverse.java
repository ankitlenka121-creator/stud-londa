class node{

    int  data;

        node next;

    node() {

        data = 90;
        next = null;//entering of first node
    }
    node(int data1, node next1){

        data=data1; //entering of middle node

        next=next1;

    }
    node(int data1){
        data=data1;//entering the last node
        next=null;
    }

}
















public class linkedlisttraverse {
    public static void main(String[] args){
        node head =new node();
             node temp = head;// temp is a  temporary variable used to move the address of head
        // before loop first node is already formed
        for(int i=4;i<9;i++){//creating three more nodes
            temp.next=new node(i+1);//create a new node after existing node
             temp=temp.next;// use to move the temp address to new node



        }
        node aryan=head;
 while(aryan!=null){
     System.out.println(aryan.data);
     aryan=aryan.next;

 }







}}

