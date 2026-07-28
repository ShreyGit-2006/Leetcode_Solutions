class Solution {
    public int findNumbers(int[] nums) {
        int i,j;
        int answer=0;
        int[] countarr = new int[nums.length];
        for(i=0;i<nums.length;i++)
        {
            int temp=nums[i];
             int count=0;
            while(temp>0)
            {
    
                temp=temp/10;
                count++;
            }
            countarr[i]=count;
        }
        for(j=0;j<countarr.length;j++)
        {
            if(countarr[j]%2==0) answer++;
        }
        return answer;
    }
}
