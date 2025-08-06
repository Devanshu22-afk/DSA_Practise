
public class Cyclicsort {

    int sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j< arr.length;j++){
            if(j!=arr[j]){
                return j;
            }
        }
        return arr.length;
    }

    private void swap(int[] arr, int a, int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        Cyclicsort s=new Cyclicsort();
        int[] arr={1,3,4,2};
        System.out.println(s.sort(arr));
    }
}
