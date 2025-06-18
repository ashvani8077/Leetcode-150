public class BestTimeToBuyAndSellStock121 {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(brute(arr));
        System.out.println(profitUsingArray(arr));

    }
    public static int brute(int arr[]){
        int profit=0;
        for(int i=0;i<arr.length-1;i++){
            int max=arr[i];
            for(int j=i+1;j<arr.length;j++){
                max=Math.max(max, arr[j]);
            }
            profit=Math.max(profit, max-arr[i]);
        }
        return profit;
    }

    public static int profitUsingArray(int arr[]){
        int profit=0;
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            min=Math.min(min, arr[i]);
            profit=Math.max(profit, arr[i]-min);
        }
        return profit;
    }
}
