class Solution {
    public int maxProduct(int n) {
       String s = String.valueOf(n);
       int[] arr = new int[s.length()];

       for(int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
      if(arr.length==1) return arr[0];
      int max=0;
       for(int i=0;i<arr.length-1;i++)
       {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]*arr[j]>max) max=arr[i]*arr[j];
        }
       }
      return max;
    }
}