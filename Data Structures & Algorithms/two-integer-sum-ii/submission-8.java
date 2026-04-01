class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers == null || numbers.length <2){
            throw new IllegalArgumentException("Invalid input");
        }
        int left = 0;
        int right = numbers.length-1;
        int[] res = new int[2];
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                res[0] = left+1;
                res[1] = right+1;
                return res;
            }
            else if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }
        throw new IllegalArgumentException("No solution found");
    }
}
