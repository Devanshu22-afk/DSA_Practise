//Bubble Sort

// import java.util.Arrays;

// public class Sorting {
//    public static void main(String[]args){

//       int arr[]={1,7,3,4,8,12,-2,6};
//       bubblesort(arr);
//       System.err.println(Arrays.toString(arr));
//    }
//    public static void swap(int[] arr, int i, int j) {
//     int temp = arr[i];
//     arr[i] = arr[j];
//     arr[j] = temp;
// }

//    public static void bubblesort(int arr[]){
//       for(int i=0;i<arr.length;i++){
//          for(int j=1;j<arr.length-i;j++){
//             if(arr[j]<arr[j-1]){
//                swap(arr,j,j-1);
//             }
//          }
//       }

//    }
// }

import java.util.Arrays;

public class Sorting{

   public static void main(String[] args) {
      int arr[]={1,4,5,6,7,8,15,34};
      selectionsort(arr);;
      System.out.println(Arrays.toString(arr));

   }

   static void swap(int[]arr,int a ,int b){
      int temp=arr[b];
      arr[b]=arr[a];
      arr[a]=temp;
   }

   static void selectionsort(int[]arr){
      for(int i=0;i<arr.length;i++){
         int last=arr.length-i-1;
         int max=Largest(arr,0,last);
         swap(arr, max, last);
      }
   }
   static int Largest(int[] arr,int start,int end){
      int max=start;
      for(int i=start;i<=end;i++){   
         if(arr[i]>arr[max]){
            max=i;
         }
      }
      return max;

   }
}
