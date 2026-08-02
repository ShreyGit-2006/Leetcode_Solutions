class Solution {
    public int kthFactor(int n, int k) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // int count=0;
        // for(int i=1;i<=n;i++)
        // {
        //     if(n%i==0) 
        //     {
        //         arr.add(i);
        //         count++;
                
        //     }
        // }
        // if(k>count) return -1;
        // return arr.get(k-1);
        for(int i=1;i<=n;i++)
        {
            if(n%i==0) k--;
            if(k==0) return i;
        }
        return -1;
    }
}