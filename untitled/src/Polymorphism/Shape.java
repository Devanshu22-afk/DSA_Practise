package Polymorphism;

public class Shape {

    //Method Overloading
//    public static void main(String[] args) {
//        Shape s=new Shape();
//        area(1,5,5);
//        area(5);
//
//    }
    static void area(int a,int b,int c){
        System.out.println("Area is:"+a*b*c);
    }
    static void area(int a){
        System.out.println("Area is:"+a*a);
    }


}
