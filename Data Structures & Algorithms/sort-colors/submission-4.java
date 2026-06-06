class Solution {
    public void swap(int[] nums, int n, int m){
        int temp = nums[n];
        nums[n] = nums[m];
        nums[m] = temp;
    }
    public void sortColors(int[] nums) {
        int i = 0;
        int m = 0;
        int j = nums.length-1;
        while(m<=j){
            if(nums[m]==0){
                swap(nums,m,i);
                m++;
                i++;
            }
            else if(nums[m]==1){
                m++;
            }
            else{
                swap(nums,m,j);
                j--;
            }
        }
    }
}