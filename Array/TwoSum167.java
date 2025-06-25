
public class TwoSum167 {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int t=9;
        int ans[]={-1,-1};
        int i=0;
        int j=arr.length-1;
        while (i<j) {
            if(arr[i]+arr[j]<t){
                i++;
            }
            else if(arr[i]+arr[j]>t){
                j--;
            }
            else{
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }
        }
    }
}
