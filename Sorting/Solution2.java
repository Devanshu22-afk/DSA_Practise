public class Solution2 {
    public int sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else if(arr[i]==arr[correct]){
                return arr[i];
            }
            else{
                i++;
            }
        }
        return -1;

    }

    private void swap(int[] arr, int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        Solution2 s=new Solution2();
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(s.sort(arr));
    }
}
