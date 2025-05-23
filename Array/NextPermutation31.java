import java.util.Arrays;

public class NextPermutation31 {

    public static void main(String[] args) {
        int arr[]={1,2,3};
    }
    public static int []solve(int arr[]){
        boolean update=false;
        for(int i=1;i<arr.length-1;i++){
            int idx=1;
            int find=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    idx=j;
                    find=1;
                }
            }
            if(find==1){
                int temp=arr[idx];
                arr[idx]=arr[i];
                arr[i]=temp;
                update=true;
                break;
            }
        }
        if(update!=true){
            Arrays.sort(arr);
            return arr;
        }
        return arr;
    }
}