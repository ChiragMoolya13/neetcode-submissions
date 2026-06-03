class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        while(i<nums.length){
            sum += nums[i];
            while(sum>=target){
                int length = i - j + 1;
                result = Math.min(result,length);
                sum -= nums[j];
                j++; 
            }
            i++;
        }
        if(result == Integer.MAX_VALUE){
            return 0;
        } 
        else{
            return result;
        }
    }
}