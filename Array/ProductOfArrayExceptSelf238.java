public class ProductOfArrayExceptSelf238{
    public static void main(String[] args) {
        int arr[]={-1,1,0,-3,3};
        int ans[]=solve3(arr);
        for(int i:ans){
            System.out.println(i);
        }
    }
    public static int []solve(int arr[]){
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int product=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    product*=arr[j];
                }
            }
            ans[i]=product;
        }
        return ans;
    }

    public static int [] solve2(int arr[]){
        int ans[]=new int[arr.length];
        int prefix[]=new int[arr.length];
        int suffix[]=new int[arr.length];
        prefix[0]=1;
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]*arr[i-1];
        }
        suffix[arr.length-1]=1;
        for(int i=arr.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*arr[i+1];
        }
        for(int i=0;i<arr.length;i++){
            ans[i]=prefix[i]*suffix[i];
        }
        return ans;
    }
    public static int[] solve3(int arr[]){
        int ans[]=new int[arr.length];
        int pre=1;
        int suff=1;
        ans[0]=1;
        for(int i=1;i<arr.length;i++){
            pre=pre*arr[i-1];
            ans[i]=pre;
        }
        for(int j=arr.length-2;j>=0;j--){
            suff=suff*arr[j+1];
            ans[j]*=suff;
        }
        return ans;
    }
}