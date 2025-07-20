package Polymorphism;

public class Rectangle extends Shape1 {
    public static void main(String[] args) {
        System.out.println("I am in Rectangle");
    }

    @Override
    void area(){
        System.out.println("I am Area of Rectangle");
    }
}
