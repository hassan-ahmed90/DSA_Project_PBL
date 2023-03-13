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
    void addData(String value,int key){
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

    public String get(String key){
        int index=hash(key);
        Node head=list[index];
        while (head!=null){
            if(head.key.equals(key))return head.value;
            head=head.next;
        }
        return null;
    }
    public String delete(String  key){
        int index=hash(key);
        Node head=list[index];
        if(head==null)return null;
        if(head.key.equals(key)){
            list[index]=head.next;
            size--;
            return head.value;
        }
        Node pre=head;
        Node curr=pre.next;
        while (curr!=null){
            if(curr.key.equals(key)){
                pre.next=curr.next;
                size--;
                return curr.value;
            }
            pre=curr;
            curr=pre.next;
        }
        return null;
    }
    public int size(){return size;}
    public boolean keyContain(String  key){
        int  index=hash(key);
        Node head=list[index];
        while (head!=null){
            if (head.key.equals(key))return true;
            head=head.next;
        }
        return false;
    }

}
