class Solution {
    public int smallestEqual(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i%10==nums[i]) arr.add(i);
        }
        if(arr.size()==0) return -1;
         int min = arr.get(0);
        for(int i=1;i<arr.size();i++)
        {
            if(min>arr.get(i)) min=arr.get(i);
        }
        return min;
    }
}