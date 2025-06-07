class Solution {
    public int findTarget(int arr[], int target) {
        // code here
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (mid+1<=arr.length-1 && arr[mid+1]==target){
                return mid+1;
            }
            else if (mid-1>=0 && arr[mid-1]==target){
                return mid-1;
            }
            else{
                if(arr[mid]>target){
                    end = mid-2;
                }
                else{
                    start = mid+2;
                }
            }
        }
        return -1;
        
    }
}
