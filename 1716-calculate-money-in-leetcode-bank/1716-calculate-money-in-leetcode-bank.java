class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;
        int sum = 0;
        for (int i = 0; i < weeks; i++) {
            sum += 28 + 7 * i;
        }
        for (int i = 0; i < days; i++) {
            sum += weeks + i + 1;
        }
        return sum;
    }
}