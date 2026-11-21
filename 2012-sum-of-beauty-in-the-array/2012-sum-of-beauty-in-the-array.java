class Solution {
    public int sumOfBeauties(int[] nums) {
        int n = nums.length;
        int[] right = new int[n];

        right[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.min(nums[i], right[i + 1]);
        }

        int max = nums[0], sum = 0;

        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > max && nums[i] < right[i + 1]) {
                sum += 2;
            }
            else if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
                sum += 1;
            }

            max = Math.max(max, nums[i]);
        }

        return sum;
    }
}