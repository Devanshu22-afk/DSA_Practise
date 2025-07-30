public class firstMissingPositive {
    int sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]>0 &&arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j< arr.length;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }

    private void swap(int[] arr, int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        firstMissingPositive s=new firstMissingPositive();
        int[] arr={1,2,0};
        System.out.println(s.sort(arr));
    }
}
