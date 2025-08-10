public class DoubltLL {
    Node head;
    Node prev;
    Node tail;
    int size;

    class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;

        }

        public Node(int val) {
            this.val = val;
        }
    }

    void insertatfirst(int val){
        Node node=new Node(val);
        if(head==null){
            head=tail=node;
        }else {
            node.next = head;
            head.prev = node;
            head = node;
            node.prev = null;
        }
    }

    void insertatlast(int val){
        Node node=new Node(val);
        node.prev=tail;
        tail.next=node;
        node.next=null;
        tail=node;
        size++;
    }

    void deleteatfirst(){
        head=head.next;
        head.prev=null;
        size-=size;
    }
    void deleteatlast(){
        tail=tail.prev;
        tail.next=null;
    }

    void deleteatpostiton(int position){
        Node current=head;
        for(int i=0;i<position;i++){
            current=current.next;
        }
        current.prev.next=current.next;
        current.next.prev=current.prev;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
    }
}