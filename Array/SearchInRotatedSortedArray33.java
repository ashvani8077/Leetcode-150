public class SearchInRotatedSortedArray33 {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int k=0;
        int i=0;
        int j=arr.length-1;
        while (i<=j) {
            int mid=(i+j)/2;
            if(arr[mid]==k){
                System.out.println(mid);
                break;
            }
            else if(arr[i]<=arr[mid]){
                if(arr[i]<=k&&k<=arr[mid]){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            else{
                if(arr[mid]<=k&&k<=arr[j]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
        }
    }
}
