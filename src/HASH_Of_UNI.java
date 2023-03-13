public class HASH_Of_UNI {

    private int size;
    Node []list;

    HASH_Of_UNI(int cap){
        list=new Node[cap];
    }
    private class Node{
        String value;
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
    while (a!=null){
    if(a.key.equals(key))break;
    a=a.next;
    }
    if(a!=null){
        a.value=value;
        return;
    }
 if(size>=0.75*list.length)refresh_Size();
 Node head=new Node();
 head.value=value;
 head.key=key;
 head.next=list[index];
 size++;

    }


}
