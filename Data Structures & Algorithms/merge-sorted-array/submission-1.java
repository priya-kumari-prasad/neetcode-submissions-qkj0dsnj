class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j= 0;
        while(j<nums2.length){
            nums1[m] = nums2[j];
            m++;j++;
        }
        Arrays.sort(nums1);
    }
}