class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i =0; i<=nums.length -1; i++){
            sum = sum + nums[i];
        }
      int ans =   sum % k ;
      return ans;
    }
}