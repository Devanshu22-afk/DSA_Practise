// public class Recursion {
//    public static void main(String[] args) {
//       int arr[]={1,2,5,4};
//       System.out.println(Sorted(arr, 0));
//       System.err.println(LinearSearch(arr, 4, 0));
//    }
//    static boolean Sorted(int[] arr,int index){
//       if(index==arr.length-1){
//          return true;
//       }

//       return arr[index]<arr[index+1] && Sorted(arr, index+1);
//    }

//    static int LinearSearch(int arr[],int target,int index){
//       if(index==arr.length){
//          System.out.println("Not Found");
//       }
//       if(arr[index]==target){
//          return index;
//       }
//       else{
//       return LinearSearch(arr, target, index+1);
//       }
//    }
// }

class Recursion{
   public static void main(String[] args) {
      Stars(4, 0);
   }
   static void  Stars(int r,int c){
      if(r==0){
         return;
      }
      if(c<r){
            System.out.print("*");
            Stars(r, c+1);
         }
         else{
            System.out.println(); 
            Stars(r-1,0);
         }
   }
}
