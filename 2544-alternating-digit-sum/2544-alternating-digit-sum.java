class Solution {
    public int alternateDigitSum(int n) {
        int temp;
        int rem;
        int rev=0;
        int sum=0;
        int count=0;
        int temp1=n;
        while(temp1>0)
        {
           rem=temp1%10;
           rev=rev*10+rem;
           temp1=temp1/10;
        }
        temp=rev;
        while(temp>0)
        {
            rem=temp%10;
            count++;
            if(count%2!=0) sum+=rem;
            else sum-=rem;
            temp=temp/10;
        }
        return sum;
    }
}