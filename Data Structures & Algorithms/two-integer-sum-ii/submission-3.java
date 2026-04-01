class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int l = 0;
        int h = n-1;
        

        while(l<h){
            int mid = numbers[l]+numbers[h];
            if(mid == target){
                return new int[] {l+1, h+1};
            }
            else if(mid < target){
                l++;
            }
            else{
                h--;
            }
        }
        return new int[] {0};
    }
}
