public class Box {
    int l;
    int b;
    int h;

    public Box(int l, int b, int w) {
        this.l = l;
        this.b = b;
        this.h = w;
    }

    Box(){

    }
    void Display(){
        System.out.println(this.l);
        System.out.println(this.b);
        System.out.println(this.h);
    }
    void Area(){
        System.out.println(l*b*h);
    }

    public Box(int s){
        this.l=s;
        this.b=s;
        this.h=s;
    }
    void Assign(){
        this.l=10;
        this.b=30;
    }
}

