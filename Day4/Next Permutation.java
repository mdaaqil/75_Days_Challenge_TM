class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1)
            return;
        int len = nums.length;
        int i = len -2;
        while(i>=0 && nums[i] >= nums[i+1]) i--;
        if(i>=0)
        {
            int j = len - 1;
            while(nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1, len - 1);
    }
    public void swap (int A[], int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public void reverse(int A[],int i,int j)
    {
        while(i<j) swap(A, i++, j--);
    }
}
