class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int multi=(((purchaseAmount+5)/10)*10);
        return 100-multi;

    }
}