import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            if(i!=arr[i]){
                System.out.println("Missing Number is"+" "+i);
            }
        }
    }
}
