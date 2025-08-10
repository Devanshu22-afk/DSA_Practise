package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape1 s=new Shape1();
        Shape1 r=new Rectangle();
        Shape1 c=new Cube();
        r.area();
        s.area();
        c.area();
    }

}
