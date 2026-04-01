class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] res = new int[2];
        for(int i = 1; i<=n; i++){
            for(int j = i+1; j<=n; j++){
                if(numbers[i-1] + numbers[j-1] == target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}
