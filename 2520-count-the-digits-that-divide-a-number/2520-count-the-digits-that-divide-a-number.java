class Solution {
    public int countDigits(int num) {
        int sum=0;
        int temp=num;
        int rem;
        int count=0;
        while(temp>0)
        {
            rem=temp%10;
            if(num%rem==0) count++;
            temp=temp/10;
        }
        return count;
}
}