class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        while(j<nums.length){
            sum += nums[j];
            while(sum>=target){
                int length = j - i + 1;
                result = Math.min(result,length);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        if(result == Integer.MAX_VALUE){
            return 0;
        } 
        else{
            return result;
        }
    }
}