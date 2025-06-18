
import java.util.Arrays;
import java.util.*;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        System.out.println(solve(arr));
        System.out.println(solve2(arr));
    }
    public static boolean solve(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }

    public static boolean solve2(int arr[]){
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        return hs.size()==arr.length?false:true;
    }
}