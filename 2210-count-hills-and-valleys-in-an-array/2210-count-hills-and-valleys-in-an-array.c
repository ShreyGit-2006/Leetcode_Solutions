int countHillValley(int* nums, int numsSize) {
    int valley=0,hill=0;
    int prev=0;
    for(int i=1;i<numsSize-1;i++)
    {
        if(nums[i]==nums[i+1]) continue;
        if(nums[prev] < nums[i] && nums[i]>nums[i+1]) hill++;
        else if(nums[prev] > nums[i] && nums[i]<nums[i+1]) valley++;
        prev=i;
    }
    return valley+hill;
}