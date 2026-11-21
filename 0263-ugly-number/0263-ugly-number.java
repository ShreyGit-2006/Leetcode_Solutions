class Solution {
    public boolean isUgly(int n) {
    // if (n <= 0)
    //     return false;
    // while (n%2 ==0)
    //     n /= 2;
    // while (n%3== 0)
    //     n /= 3;
    // while (n%5== 0)
    //     n/=5;
    // return n == 1;
    if(n<=0) return false;
    n=f(n,2);
    n=f(n,3);
    n=f(n,5);
    return n==1;
}
private int f(int n,int p)
{
    while(n%p==0) n=n/p;
    return n;
}

}