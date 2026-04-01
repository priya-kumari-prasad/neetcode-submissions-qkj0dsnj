class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums, 0, nums.length-1);
        return nums;
    }

    private void divide(int[] arr, int st, int end){
        if(st >= end){
            return;
        }
        int mid = st + (end-st)/2;

        divide(arr, st, mid);
        divide(arr, mid+1, end);
        conquer(arr, st, mid, end);
    }

    private void conquer(int[] arr, int l, int m , int r){
        ArrayList<Integer> temp = new ArrayList<>();
        int low = l; 
        int high = m+1;

        while(low<= m & high <= r){
            if(arr[low] <= arr[high]){
                temp.add(arr[low]);
                low++;
            }
            else{
                temp.add(arr[high]);
                high++;
            }
        }

        while(low <= m){
            temp.add(arr[low]);
            low++;
        } 
        while(high <= r){
            temp.add(arr[high]);
            high++;
        }

        for(low = l; low<=r; low++){
            arr[low] = temp.get(low-l);
        }
    }
}