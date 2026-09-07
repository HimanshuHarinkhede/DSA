class Solution {
    public void rotate(int[] nums, int k) {
        int r = nums.length;
        k = k%r;
        reverse(nums,0,r-1); //first reverse(whole array will be reversed)
        reverse(nums,0,k-1); //second reverse(0 to k-1 element will be reversed)
        reverse(nums, k,r-1); // third reverse(the remaining elements reversed)
        }
        public static void reverse(int nums[],int st, int ls){ //here, using another function(swapping code)
        while(st<ls){
            int temp = nums[st];
            nums[st] = nums[ls];
            nums[ls] = temp;
            st++;
            ls--;
        }
    }
}
