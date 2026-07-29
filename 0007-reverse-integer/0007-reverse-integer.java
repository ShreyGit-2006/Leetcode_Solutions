class Solution {
    public int reverse(int x) {
        int temp1=x;
        int temp=Math.abs(x);
        int rem=0;
        int rev=0;
        while(temp>0)
        {
            rem=temp%10;
            // Overflow check
            if (rev > (Integer.MAX_VALUE - rem) / 10)
                return 0;
            rev=(rev*10)+rem;
            temp=temp/10;
        }
        if(temp1<0) return -(rev);
        else return rev;
    }
}