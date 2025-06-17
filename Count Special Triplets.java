class Solution {
    public int specialTriplets(int[] nums) {
        int count =0;
        int mod = 1000000007;
        HashMap<Integer,Integer> suffix = new HashMap<>();
        HashMap<Integer,Integer> prefix = new HashMap<>();
        for(int i =1;i<nums.length;i++){
            suffix.put(nums[i],suffix.getOrDefault(nums[i],0)+1);
        }
        prefix.put(nums[0],1);
        for(int i =1;i<nums.length;i++){
            suffix.put(nums[i],suffix.get(nums[i])-1);
            int req = nums[i]*2;
            if(prefix.containsKey(req) && suffix.containsKey(req)){
                count = (int)(count +( 1L* prefix.get(req) * suffix.get(req))%mod)%mod;
            }
            prefix.put(nums[i],prefix.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
}
