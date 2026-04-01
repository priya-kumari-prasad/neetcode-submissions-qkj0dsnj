class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
    private void mergeSort(int[] nums, int left, int right){
        if(left >= right) return;
        int mid = (left + right) >> 1;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid+1, right);
        merge(nums, left, mid, right);
    }

    private void merge(int[] arr, int l, int m, int r){
        ArrayList<Integer> temp = new ArrayList<>();
        int i = l;
        int j = m+1;

        while(i<= m && j <= r){
            if(arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
            }
        }

        while(i<=m){
            temp.add(arr[i]);
            i++;
        }
        while(j<=r){
            temp.add(arr[j]);
            j++;
        }

        for(i = l; i<=r; i++){
            arr[i] = temp.get(i-l);
        }
    }
}