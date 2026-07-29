class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int rem=0;
        int rev=0;
        while(temp>0)
        {
            rem=temp%10;
            rev=(rev*10)+rem;
            temp=temp/10;
        }
        int temp1=rev;
        rev=0;
        while(temp1>0)
        {
            rem=temp1%10;
            rev=(rev*10)+rem;
            temp1=temp1/10;
        }
        if(num==rev) return true;
        else return false;
    }
}