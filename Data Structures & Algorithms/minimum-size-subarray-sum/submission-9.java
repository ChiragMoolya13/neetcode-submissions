class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        while(i<n){
            sum += nums[i];
            while(sum>=target){
                int length = i - j + 1;
                result = Math.min(result, length);
                sum -= nums[j];
                j++;
            }
            i++;
        }
        int ans = (result == Integer.MAX_VALUE) ? 0 : result;
        return ans;
    }
}