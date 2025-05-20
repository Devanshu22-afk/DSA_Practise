// import java.util.*;
// class Array{
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int[] arr={1,2,3,4,5};

//     for(int i=0;i<arr.length;i++){
//       arr[i]=sc.nextInt();
//     }
//     System.out.println("Enter the Target:");
//     int target=sc.nextInt();

//     for(int i=0;i<arr.length;i++){
//       if(arr[i]==target){
//         System.out.println("Item Found at:"+arr[i]);
//       }
//     }
//   }
// }

//Binary Search Code:-

// class Array{
//   public static void main(String[] args) {
//     int arr[]={1,2,3,4,5,6,7,8,94};
//     int target=7;
//     System.out.println(BinarySearch(arr, target));
//   }

//   static int BinarySearch(int arr[],int target){
//     int start=0;
//     int end=arr.length-1;
//     while(start<=end){
//       int mid=(start+end)/2;
//       if(target<arr[mid]){
//         end=mid-1;
//       }
//       else if(target >arr[mid]){
//         start=mid+1;
//       }
//       else{
//         return mid;
//       }
//     }
//     return -1;
//   }
// }

// // Ceiling of a number:-

// class Array{
//   public static void main(String[] args) {
//     int arr[]={1,2,4,5,6,8,9};
//     int target=3;
//     System.out.println(BinarySearch(arr, target));
//   }

//   static int BinarySearch(int arr[],int target){
//     int start=0;
//     int end=arr.length-1;
//     while(start<=end){
//       int mid=(start+end)/2;
//       if(target<arr[mid]){
//         end=mid-1;
//       }
//       else if(target >arr[mid]){
//         start=mid+1;
//       }
//       else{
//         return mid;
//       }
//     }
//     return start;
//   }
// }

// Floor of a number:-

// class Array{
//   public static void main(String[] args) {
//     int arr[]={1,2,4,5,6,8,9};
//     int target=3;
//     System.out.println(BinarySearch(arr, target));
//   }

//   static int BinarySearch(int arr[],int target){
//     int start=0;
//     int end=arr.length-1;
//     while(start<=end){
//       int mid=(start+end)/2;
//       if(target<arr[mid]){
//         end=mid-1;
//       }
//       else if(target >arr[mid]){
//         start=mid+1;
//       }
//       else{
//         return mid;
//       }
//     }
//     return end;
//   }
// }


// class Array {
//     public char nextGreatestLetter(char[] letters, char target) {
//         int start=0;
//         int end=letters.length-1;
//         while(start<=end){
//           int mid=(start+end)/2;
//             if(target>mid){
//                 start=mid+1;
//             }
//             else if(target<mid){
//                 end=mid-1;
//             }
//             else{
//                 return target;
//             }

//         }
//         return letters[start];    
//     }
// }

// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int[] ans={-1,-1};
//         int start=search(nums, target, true);
//         int end=search(nums, target, false);

//         ans[0]=start;
//         ans[1]=end;
//     return ans;
//     }
//      public int search(int[] nums, int target, boolean firstelemet){
//                 int start=0;
//                 int end=nums.length-1;
//                 int mid=(start+end)/2;
                
//                 while(start>end){
//                     if(target>nums[mid]){
//                         start=mid+1;
//                     }
//                     else if(target<nums[mid]){
//                         end=mid-1;
//                     }
//                     else{
//                         if(firstelemet){
//                             end=mid-1;
//                         }
//                         else{
//                             start=mid+1;
//                         }
//                     }
//                 }
//                 return -1;

//             }

//             public static void main(String[] args) {
//               int[] arr={5,7,7,8,8,10};
//               System.out.println(searchRange(arr,));
//             }
           

// }

