import java.util.HashMap;

public class ContainsDuplicate219 {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        int k=3;
        System.out.println(solve(arr, k));
        System.out.println(solve2(arr, k));
    }
    public static boolean solve(int arr[], int k){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]&&Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean solve2(int arr[], int k){
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])&&Math.abs(mp.get(arr[i])-i)<=k){
                return true;
            }
            else{
                mp.put(arr[i], i);
            }
        }
        return false;
    }
}
