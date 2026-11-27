import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0; // Absolute difference cannot be negative

        Map<Integer, Integer> h = new HashMap<>();
        int count = 0;

        for (int i : nums) {
            h.put(i, h.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            int i = entry.getKey();
            int j = entry.getValue();

            if (k == 0) {
                if (j >= 2) {
                    count++;
                }
            } else if (h.containsKey(i + k)) {
                count++;
            }
        }

        return count;
    }
}
