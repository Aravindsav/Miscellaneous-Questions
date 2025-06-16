class Solution {
    public long maximumProduct(int[] nums, int m) {

    long ans =Long.MIN_VALUE;
        int maxSofar = nums[0];
        int minSofar = nums[0];
        for(int j = m-1;j<nums.length;j++){
            int i = j-m+1;
            maxSofar = Math.max(maxSofar,nums[i]);
            minSofar = Math.min(minSofar,nums[i]);

        long maxProduct = 1L*nums[j]*maxSofar;
        long minProduct = 1L*nums[j]*minSofar;
        ans =  Math.max(ans,Math.max(maxProduct,minProduct));
        }
        return ans;
    }
}
