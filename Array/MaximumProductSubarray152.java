public class MaximumProductSubarray152 {
    public static void main(String[] args) {
        int arr[]={-2,0,-1};
        int maxPro=arr[0];
        for(int i=0;i<arr.length;i++){
            int pro=1;
            for(int j=i;j<arr.length;j++){
                pro=pro*arr[j];
                maxPro=Math.max(maxPro,pro);
            }
        }
        System.out.println(maxPro);
    }
}
