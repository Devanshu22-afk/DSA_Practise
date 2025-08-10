public class EvenDigits {
   static int evenDigits(int arr[]){
      int count=0;
      for(int i=0;i<arr.length;i++){
         if(arr[i]%2==0){
            count++;
         }
      }
      return count;
   }
   public static void main(String[]args){
      int[] arr={12,13,5,3,7,4};
      System.out.println(evenDigits(arr));
   }
}
