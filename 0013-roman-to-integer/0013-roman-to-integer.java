class Solution {
    public int romanToInt(String s) {
        String r = "IVXLCDM";
        int[] val = {1, 5, 10, 50, 100, 500, 1000};

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int a = val[r.indexOf(s.charAt(i))];

            if (i + 1 < s.length() &&
                a < val[r.indexOf(s.charAt(i + 1))])
                sum -= a;
            else
                sum += a;
        }

        return sum;
    }
}