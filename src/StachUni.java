import java.util.EmptyStackException;

public class StachUni {


    static class Node{
        Node next;
        String data;
        Node(String data,Node next){
            this.data=data;
            this.next=next;
        }
    }

   private Node top;
    private int size;

    public boolean isKhali(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public String pop(){
        if(isKhali())throw new EmptyStackException();
        String temp=top.data;
        top=top.next;
        size--;
        return temp;
    }
    public String peek(){

        if(isKhali()) throw new IllegalArgumentException("Kali ha");
        return top.data;

    }
    public void push(String data){

        top=new Node(data,top);
        size++;

    }
    public String get(int position){
        if(position<1||position>size)throw new IllegalArgumentException("Incorrect index");
        Node temp=top;
        for(int j=1;j<position;j++)temp=temp.next;
        return temp.data;
    }

    public void push(String key,PAK_UNIVERSITIES university,String orderBy){
        Node temp=top;
        if(orderBy.equals("noOfPublications")){
            if(isKhali()||Main.getMap().get(top.data).getNo_Of_Publication()< university.getNo_Of_Publication()){
                top=new Node(key,top);
                size++;
                return;
            }

            while (temp.next!=null){
                if(Main.getMap().get(temp.next.data).getNo_Of_Publication()< university.getNo_Of_Publication())break;
                temp=temp.next;
            }

        }
        else if(orderBy.equals("PakRanking")){
            if(isKhali()||Main.getMap().get(top.data).getPak_Rank()> university.getPak_Rank()){
                top=new Node(key,top);
                size++;
                return;
            }

            while (temp.next!=null){
                if(Main.getMap().get(temp.next.data).getPak_Rank()> university.getPak_Rank())break;
                temp=temp.next;
            }


        }
        Node n=new Node(key,null);
        n.next=temp.next;
        temp.next=n;
        size++;

    }

    public void traverse(){
        for(Node n=top;n!=null;n=n.next) System.out.println(Main.getMap().get(n.data));
    }


}
