public class BoxPrice extends Box{

    int Rupees;
    int paise;

    public BoxPrice(int l, int b, int w,int Rupees,int paise) {
        super(l, b, w);
        this.Rupees=Rupees;
        this.paise=paise;
    }

    public BoxPrice( int rupees, int paise) {
        this.Rupees = rupees;
        this.paise = paise;
    }
    public BoxPrice(){
        this.Rupees=0;
        this.paise=0;
    }

    void Edit(){
        this.l=10;
    }
}
