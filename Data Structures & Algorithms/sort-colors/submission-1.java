class Solution {
    public void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int i = 0;
        int m = 0;
        int j = nums.length - 1;
        while(m<=j){
            if(nums[m] == 0){
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