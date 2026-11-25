class Solution {
    public int missingNumber(int[] nums) {
        int total=0;
        int n=nums.length;
        int actual=n*(n+1)/2;
        for(int i=0;i<n;i++)
        {
            total+=nums[i];
        }
        return actual-total;
    }
}