public class MaximumSubarray53 {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int maxSum=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum<=0){
                sum=0;
            }
            else{
                maxSum=Math.max(maxSum,sum);
            }
        }
    }
}
