class Solution {
    public boolean isMonotonic(int[] nums) {

        int count = 0;
        int count1 = 0;
        int size = nums.length;

        for (int i = 0; i < size - 1; i++) {

            if (nums[i] <= nums[i + 1])
                count++;

            if (nums[i] >= nums[i + 1])
                count1++;
        }

        return count == size - 1 || count1 == size - 1;
    }
}