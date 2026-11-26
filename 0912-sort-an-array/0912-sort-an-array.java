class Solution {
    static void mergesort(int arr[],int low,int high)
    {
        int mid;
        if(low < high)
        {
            mid=(low+high)/2;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    static void merge(int arr[], int low, int mid, int high)
    {
        int i = low;
        int j = mid + 1;
        int k = 0;
       int temp[] = new int[high - low + 1];

        while(i <= mid && j <= high)
        {
            if(arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while(i <= mid)
            temp[k++] = arr[i++];

        while(j <= high)
            temp[k++] = arr[j++];

        for(i = low, k = 0; i <= high; i++, k++)
        {
            arr[i] = temp[k];
        }
    }
    public int[] sortArray(int[] nums) {
        mergesort(nums, 0, nums.length - 1);
        return nums;
    }
}




