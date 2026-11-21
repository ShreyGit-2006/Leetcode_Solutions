class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        if(n==4) return false;
        int s=n;
        int f=n;
        while(true)
        {
           s=gs(s);
           f=gs(gs(f));
           if(f==1) return true;
           if(s==f)
           {
            return s==1;
           }
        }
    }
    private int gs(int n)
    {
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum+=r*r;
            n=n/10;
        }
        return sum;
    }
}