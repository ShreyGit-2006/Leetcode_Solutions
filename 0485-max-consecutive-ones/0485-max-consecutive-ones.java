class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int maxCount = 0;

for (int right = 0; right < nums.length; right++) {

    if (nums[right] == 0) {
        left = right + 1;
    }
    maxCount = Math.max(maxCount, right - left + 1);
}
return maxCount;

    }
}