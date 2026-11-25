// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         ArrayList<Integer> list= new ArrayList<>();
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         int i=0;
//         int j=0;
//         while(i<nums1.length && j<nums2.length)
//         {
//             if(nums1[i]==nums2[j])
//             {
//                 if (!list.contains(nums1[i])) {
//                     list.add(nums1[i]);
//                 }
//                 i++;
//                 j++;
//             }
//             else if(nums1[i]<nums2[j]) i++;
//             else j++;
//         }
//         int[] result = new int[list.size()];
//         for (int k = 0; k < list.size(); k++) {
//             result[k] = list.get(k);
//         }
        
//         return result;
//     }
// }
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }
        int[] ans = new int[result.size()];
        int i = 0;

        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }
}


