class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums, 0, nums.length-1);
        return nums;
    }

    private static void divide(int nums[], int st, int end){
        if(st >= end){
            return;
        }
        int mid = st+(end-st)/2;
        divide(nums, st, mid);
        divide(nums, mid+1, end);
        conquer(nums, st, mid, end);
    }

    private static void conquer(int nums[], int st, int mid, int end){
        int[] merged = new int[end -st + 1];
        int idx1 = st;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= end){
            if(nums[idx1] > nums[idx2]){
                merged[x++] = nums[idx2];
                idx2++;
            }
            else{
                merged[x++] = nums[idx1];
                idx1++;
            }
        }

        while(idx1 <= mid){
            merged[x++] = nums[idx1++];
        }
        while(idx2 <= end){
            merged[x++] = nums[idx2++];
        }

        for(int i = 0, j= st; i<merged.length;i++, j++){
            nums[j] = merged[i];
        }
    }
}