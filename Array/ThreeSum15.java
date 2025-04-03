import java.util.*;
public class ThreeSum15 {
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        List<List<Integer>>li=brute(arr);

    }

    public static List<List<Integer>> brute(int arr[]){
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer>temp=Arrays.asList(arr[i],arr[j],arr[k]);
                        Collections.sort(temp);
                        if(!ll.contains(temp)){
                            ll.add(temp);
                        }
                    }
                }
            }
        }
        return ll;
    }

    public static List<List<Integer>> better(int arr[]){
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            HashSet<Integer>hs=new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                int rem=arr[i]+arr[j];
                rem=-rem;
                if(hs.contains(rem)){
                    List<Integer>temp=Arrays.asList(arr[i],arr[j],rem);
                    Collections.sort(temp);
                    if(!ll.contains(temp)){
                        ll.add(temp);
                    }
                }
                hs.add(arr[j]);
            }
        }
        return ll;
    }

    public static List<List<Integer>> optimal(int arr[]){
        Arrays.sort(arr);
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i>0&&arr[i]==arr[i-1])continue;
            int j=i+1;
            int k=arr.length-1;
            while (j<k) {
                int sum=arr[i]+arr[j]+arr[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer>temp=Arrays.asList(arr[i],arr[j],arr[k]);
                    Collections.sort(temp);
                    if(!ll.contains(temp)){
                        ll.add(temp);
                    }
                }
            }
        }
        return ll;
    }
}
