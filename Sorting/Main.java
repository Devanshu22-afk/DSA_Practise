import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        Linkedlist l=new Linkedlist();
        l.insertatfirst(40);
        l.insertatfirst(30);
        l.insertatfirst(20);
        l.insertatfirst(10);
        l.insertatend(50);
        l.makecycle();
        System.out.println(l.detectcycle());




//        DoubltLL d=new DoubltLL();
//        d.insertatfirst(10);
//        d.insertatfirst(20);
//        d.insertatfirst(30);
//        d.insertatlast(5);
//        d.insertatfirst(40);
//        d.deleteatpostiton(2);
//        d.display();

//        CLL c=new CLL();
//        c.insertatfirst(10);
//        c.insertatfirst(20);
//        c.insertatfirst(30);
//        c.insertatlast(40);
//        c.display();

    }
}
