// public class FinbonacciNumber {
//    public static void main(String[] args) {
//       for(int i=0;i<8;i++){
//          System.err.println(fibo(i));
//       }
//    }
//       static int fibo(int n){
//             if(n<2)
//             {
//             return n;
//             }
//             else{
//                return fibo(n-1)+fibo(n-2);
//             }
//       }

//    }

class FinbonacciNumber{
   public static void main(String[] args) {
      System.out.println(fact(5));
   }
   static int fact(int n){
      if(n<2){
         return n;
      }
      return fact(n-1)*n;
   }
}
