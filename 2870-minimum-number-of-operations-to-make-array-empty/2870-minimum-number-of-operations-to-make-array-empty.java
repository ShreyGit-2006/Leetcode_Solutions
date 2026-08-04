class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);

        int ans = 0;
        int n = nums.length;
        int i = 0;

        while (i < n) {
            int count = 1;

            while (i + 1 < n && nums[i] == nums[i + 1]) {
                count++;
                i++;
            }

            if (count == 1)
                return -1;

            ans += (count + 2) / 3;

            i++;
        }

        return ans;
    }
}