import java.util.HashMap;

public class TwoSum1{
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        int ans[]=brute(arr, target);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }


    }
    public static int[] brute(int arr[], int target){
        int ans[]={0,0};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target&&i!=j){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }
    
    public static int [] hashSet(int arr[], int target){
        int ans[]={0,0};
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int left=target-arr[i];
            if(mp.containsKey(left)){
                ans[0]=mp.get(left);
                ans[1]=i;
                break;
            }
            else{
                mp.put(arr[i], i);
            }
        }
        return ans;
    }
}