class Solution {

// Question which can be Stumbled If not observed properly.
public boolean canBeDone(int nums[],int target,int k){
    int arr[] = nums.clone();
    int count =0;
    for(int i =0;i<nums.length-1;i++){
        if(arr[i]!=target){
            arr[i]*=-1;
            arr[i+1]*=-1;
            count++;   
        }
    }
    for(int val: arr){
        if(val!=target){
            return false;
        }
    
    }
    return count<=k;
}

    
    public boolean canMakeEqual(int[] nums, int k) {

        return canBeDone(nums,1,k) || canBeDone(nums,-1,k);
        
    }
}©leetcode
