class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int k = 1;
        int n = nums.length;
        while(k<n){
            if(nums[k]!=nums[i]){
                i++;
                nums[i] = nums[k];
            }
            k++;
        }
        return i+1;
    }
}