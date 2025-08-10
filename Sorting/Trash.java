public class Trash {

    public static boolean palidromecheck(int num){
        int on=num;
        int rn=0;
        while(num>0){
            int digit=num%10;
            rn=rn*10+digit;
            num/=10;
        }
        return on == rn;
    }

    public static void main(String[] args) {
        int a=1234;
        int b=a/10;
        System.out.println(palidromecheck(121));
    }
}
