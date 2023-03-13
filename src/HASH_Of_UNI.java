import java.lang.Object;
import java.util.HashMap;
public class HASH_Of_UNI {

    private int size;
    Node []list;

    HASH_Of_UNI(int cap){
        list=new Node[cap];
    }
    private class Node{
        PAK_UNIVERSITIES value;
        String key;
        Node next;

    }

private int hash(int key){
    return Math.abs(key.hashCode())% list.length;
}

    void refresh_Size(){
        Node [] aa=list;
        list=new Node[list.length*2];
        for(Node head:aa){
            while (head != null) {
            Node temp =head.next;
            int index=hash(head.key);
            head.next=list[index];
            list[index]=head;
            head=temp;
            }
        }
    }
    void push(String value,int key){
    int index=hash(key);
    Node a= list[index];
    }


}
