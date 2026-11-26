class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        Arrays.sort(restrictions, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 0});

        for(int[] r : restrictions) {
            if(r[0] != 1)
                list.add(r);
        }

        for(int i = 1; i < list.size(); i++) {
            int[] prev = list.get(i-1);
            int[] curr = list.get(i);

            curr[1] = Math.min(curr[1], prev[1] + curr[0] - prev[0]);
        }

        for(int i = list.size()-2; i >= 0; i--) {
            int[] curr = list.get(i);
            int[] next = list.get(i+1);

            curr[1] = Math.min(curr[1], next[1] + next[0] - curr[0]);
        }

        int max = 0;

        for(int i = 1; i < list.size(); i++) {
            int[] prev = list.get(i-1);
            int[] curr = list.get(i);

            int gap = curr[0] - prev[0];
            int height = (prev[1] + curr[1] + gap) / 2;

            max = Math.max(max, height);
        }

        max = Math.max(max, list.get(list.size()-1)[1] + n - list.get(list.size()-1)[0]);

        return max;
    }
}