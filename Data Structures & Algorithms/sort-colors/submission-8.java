class Solution {
    public void swap(int[] nums, int n, int m){
        int temp = nums[n];
        nums[n] = nums[m];
        nums[m] = temp;
    }
    public void sortColors(int[] nums) {
        int m = 0;
        int j = 0;
        int k = nums.length - 1;
        while(m<=k){
            if(nums[m]==0){
                swap(nums,m,j);
                m++;
                j++;
            }
            else if(nums[m]==1){
                m++;
            }
            else{
                swap(nums,m,k);
                k--;
            }
        }
    }
}