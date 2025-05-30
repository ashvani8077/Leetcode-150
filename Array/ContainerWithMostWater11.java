public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
    }

    public static int solve(int arr[]){
        int i=0;
        int j=arr.length-1;
        int ans=0;
        while(i<j){
            ans=Math.max(ans, (j-i)*Math.min(arr[i], arr[j]));
            if(arr[i]<arr[j]){
                i++;
            }
            else {
                j--;
            }
        }
        return ans;
    }

}
