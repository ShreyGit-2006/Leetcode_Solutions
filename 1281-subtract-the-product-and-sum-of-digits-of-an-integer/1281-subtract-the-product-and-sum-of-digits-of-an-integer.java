class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n;
        int temp1=n;
        int sum=1;
        int sum1=0;
        int rem;
        int rem1;
        while(temp>0)
        {
            rem=temp%10;
            sum*=rem;
            temp=temp/10;
        }
        while(temp1>0)
        {
            rem1=temp1%10;
            sum1+=rem1;
            temp1=temp1/10;
        }
        return sum-sum1;
    }
}