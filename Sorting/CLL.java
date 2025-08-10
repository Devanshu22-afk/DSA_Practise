public class CLL {
    Node head;
    Node tail;
    int size;

    void insertatfirst(int val){
        Node node=new Node(val);

        if(head==null){
            head=node;
            tail=node;
            node.next=tail;
        }else {
            node.next = head;
            head = node;
            tail.next = node;
        }
    }

    void insertatlast(int val){
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        node.next=head;
    }

    void display(){
        Node temp=head;
        if (head == null) {  // Empty list check
            System.out.println("List is empty");
            return;
        }
        do{
            System.out.print(temp.value+"->");
            temp=temp.next;
        }while (temp!=head);
    }

    class Node{
        Node next;
        int value;


        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
