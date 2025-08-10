public class Linkedlist {
    Node head;
    Node tail;
    int size=0;

    void insertatfirst(int val){
        Node n=new Node(val);
        n.next=head;
        head=n;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    void insertatend(int val){
        Node n=new Node(val);
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=n;
        size+=1;
    }

    void insertatend1(int val){
        Node node=new Node(val);
        tail.next=node;
        node.next=null;
        size++;
    }

    void deleteatfirst(){
        head=head.next;
        size-=1;
    }
    void deleteatlast(){
        Node current=new Node();
        current=head;
        while(current.next!=null){
            current=current.next;
        }
        current=tail;
        current.next=null;
    }
    void deleteatlast1(){
        size-=1;
        tail.next=null;
    }
    void deleteatgivenposition(int position){

        if(position==0){
            head=head.next;
        }
        Node current=head;
        for(int i=0;i<position-1;i++){
            current=current.next;
        }
        current.next=current.next.next;
    }

    void deletegivennode(Node node){
        node.val=node.next.val;
        node.next=node.next.next;
    }

    void insertatmiddle(int val,int position){
        Node n=new Node(val);
        if (position == 0) {
            n.next = head;
            head = n;
            return;
        }

        Node current=head;
        for(int i=0;current!=null && i<position-1;i++){
            current=current.next;
        }
        assert current != null;
        n.next=current.next;
        current.next=n;
        size++;
    }

    void display(){
        System.out.print('[');
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val);
            if(temp.next!=null){
                System.out.print("->");
            }
            temp=temp.next;
        }
        System.out.println("]");
    }

    void makecycle(){
        tail.next=head.next;
    }

    boolean detectcycle(){
        Node temp=head;
        while(temp!=null){
            if(tail.next==temp.next){
                return true;
            }else return false;
        }
        return false;
    }

    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node() {

        }
    }
}
